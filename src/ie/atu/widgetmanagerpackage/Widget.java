package ie.atu.widgetmanagerpackage;

public class Widget {

	// Instance Variables
	private String widgetId;
	private String name;
	private int ageInMonths;
	private String colour;
	
	// Constructor
	public Widget(String widgetId, String name, int ageInMonths, String colour) {
		this.widgetId = widgetId;
		this.name = name;
		this.ageInMonths = ageInMonths;
		this.colour = colour;
	}
	
	// Getters and Setters
	public String getWidgetId() {
		return widgetId;
	}

	public void setWidgetId(String widgetId) {
		this.widgetId = widgetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
