package ie.atu.widgetmanagerpackage;

import java.util.ArrayList;
import java.util.List;

public class WidgetManager {

	// Instance Variable
	private List<Widget> widgetList;

	// Constructor
	public WidgetManager() {
		this.widgetList = new ArrayList<>();
	}

	// Getters and Setters
	public List<Widget> getwidgetList() {
		return widgetList;
	}

	public void setwidgetList(List<Widget> widgetList) {
		this.widgetList = widgetList;
	}

	// Find widget object by ID. Returns null if widget is not found.
	public Widget findwidgetObjectByID(String widgetID) {
		// Search all student objects in the student list
		for (Widget widgetObject : widgetList) {
			// Compare IDs to ID passed in
			if (widgetID.equals(widgetObject.getWidgetId())) {
				// If a match is found return the student object
				System.out.println("Widget object with ID = " + widgetID + " was found on list!");
				return widgetObject;
			}
		}
		// If no match is found return null
		System.out.println("Widget object with ID = " + widgetID + " was NOT found on list!");
		return null;
	}

	// Returns true if student on list
	public boolean isOnList(String widgetId) {
		return widgetList.contains(findwidgetObjectByID(widgetId));
	}

	// Add widget to list
	public boolean addWidgetToList(String widgetId, String author, int age, String title) {
		// If widget is NOT already on list
		if (!isOnList(widgetId)) {
			// Create widget object with valid details and add student to the list
			Widget newwidget = new Widget(widgetId, author, age, title);
			return this.widgetList.add(newwidget);
		}
		// If student details are invalid or if student is already on list return false
		System.out.println("widget with ID " + widgetId + " could not be added to list!");
		return false;
	}

	// Remove widget from list given studendID
	public boolean removeWidgetFromList(String widgetId) {
		return widgetList.remove(findwidgetObjectByID(widgetId));
	}

}
