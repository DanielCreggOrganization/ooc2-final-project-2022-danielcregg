package ie.atu.widgetmanagerpackage;

public class Main {  
    // This is the main method.
    public static void main(String[] args) {
        
        //widget widgetObject1 = new widget("B123456", "Rowling", 10, "Philly Stone");
        
        //System.out.println(widgetObject1.getAuthor());
        
        WidgetManager widgetManagerObject1 = new WidgetManager();
        
        widgetManagerObject1.addWidgetToList("W00123456", "Thingy", 12, "Grey");
        
        System.out.println(widgetManagerObject1.getwidgetList().get(0).getColour());
    
    } // End main method
} // End Main class
