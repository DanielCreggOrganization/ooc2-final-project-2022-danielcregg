package ie.atu.widgetmanagerpackage;

// This is the main method.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * The Main class holds the main method.
 */
public class Main extends Application {

	// Createa a new instance of the WidgetManager class.
	WidgetManager wm = new WidgetManager(); // Used for managing widgets

	// Override the start method.
	@Override
	public void start(Stage primaryStage) {

		// Create a GridPane to hold the GUI nodes
		GridPane gridPane1 = new GridPane(); // Create gridpane node to use as root node of scene

		// Create child nodes

		// Create Text node for label at top of scene 1
		Text txtHeader = new Text("Please select an option below:");

		// Add Widget Button and 3 text fields for entering Widget details
		Button btnAddWidget = new Button("Add Widget");
		TextField tfWidgetID = new TextField();
		tfWidgetID.setPromptText("Widget ID");
		TextField tfWidgetName = new TextField();
		tfWidgetName.setPromptText("Name");
		TextField tfWidgetAge = new TextField();
		tfWidgetAge.setPromptText("Age In Months");
		TextField tfWidgetColour = new TextField();
		tfWidgetColour.setPromptText("Colour");

		// Create TextArea node for bottom of scene 1 to display output
		TextArea taMyOutput = new TextArea();

		// Create a button and text field to take a Widget ID for deleting a Widget
		// from the list
		Button btnRemoveWidget = new Button("Remove Widget");
		TextField tfDelWidget = new TextField();
		tfDelWidget.setPromptText("Widget ID");

		// Adding and arranging all the nodes in the grid - add(node, column, row)
		gridPane1.add(txtHeader, 0, 0);
		gridPane1.add(btnAddWidget, 0, 2);
		gridPane1.add(tfWidgetID, 1, 2);
		gridPane1.add(tfWidgetName, 2, 2);
		gridPane1.add(tfWidgetAge, 3, 2);
		gridPane1.add(tfWidgetColour, 4, 2);
		gridPane1.add(btnRemoveWidget, 0, 3);
		gridPane1.add(tfDelWidget, 1, 3);
		gridPane1.add(taMyOutput, 0, 8, 5, 1);

		// Add Widget button action
		btnAddWidget.setOnAction(e -> {
			// If any of the Widget fields are empty print prompt message
			if (tfWidgetID.getText().trim().equals("") || tfWidgetName.getText().trim().equals("")
					|| tfWidgetAge.getText().trim().equals("") || tfWidgetColour.getText().trim().equals("")) {
				taMyOutput.setText("Please enter ALL Widget details!");
			} else {
				// Create new Widget with information in text fields
				// Add Widget to Widget list
				if (wm.addWidgetToList(tfWidgetID.getText(), tfWidgetName.getText(),
						Integer.parseInt(tfWidgetAge.getText()), tfWidgetColour.getText())) {
					taMyOutput.setText("Widget added to list successfully\n");
				} else {
					taMyOutput.setText("Widget not added to list\n");
				}
				// Clear input fields for next Widget
				tfWidgetID.clear();
				tfWidgetName.clear();
				tfWidgetAge.clear();
				tfWidgetColour.clear();
			}
		});

		// Remove Widget button action
		btnRemoveWidget.setOnAction(e -> {

			if (tfDelWidget.getText().trim().equals("")) { // If text field is empty
				taMyOutput.setText("Please enter the Widget ID you want to remove");
			} else {
				boolean status;
				status = wm.removeWidgetFromList(tfDelWidget.getText());
				if (status == true) {
					taMyOutput.setText(tfDelWidget.getText() + " has been removed from the Widget list!");
					tfDelWidget.clear();
				} else {
					taMyOutput.setText("Widget " + tfDelWidget.getText() + " not found\n");
					taMyOutput.appendText("No Widget removed!");
					tfDelWidget.clear();
				}
			}

		});

		// Create scene and add the root node i.e. the gridpane
		Scene scene1 = new Scene(gridPane1, 600, 450);
		// Preparing the Stage (i.e. the container of any JavaFX application)
		// Set Stage Title
		primaryStage.setTitle("Student Manager Application");
		// Setting the scene on which this stage will show
		primaryStage.setScene(scene1);
		// Display the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

} // End Main class
