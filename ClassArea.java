// This is our class called ClassArea.java
// We use this class to create Area like rooms.
// We put variables and methods inside of classes.
// variables are the data called properties.
// methods are the functions aka the actions that operate on the data.
public class ClassArea {
    //Create a private sring variable to hold a description of the area.
    // This is called a property of the class.
    private String Description;
    // Create a private string variable to hold the name of the area
    private String Name;

    // Create a constructor for the class.
    // This is a special method that is called when you create an object of the class.
    // The constructos is used to initialize the properties of the class.
    // The constructor has the same name as the class.
    // The constructor does not have a return type.
    public ClassArea(String description, String name){
        //Initialize the Description property by setting it to the value passed in the description parameter.
        Description = description;
        Name = name;
    }

    // Create a method in the room class to retun not display the Name value of the property.
    // This is called a getter method.
    public String GetName() {
        // Return the value of the Name property
        return Name;
    }

    // Create a method in the room class to retun not display the Description value of the property.
    // This is called a getter method.
    public String GetDescription() {
        // Return the value of the Description property
        return Description;
    }
}
