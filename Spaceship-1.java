// Create a new class called Spaceship.java.
//We put variables and methods inside of classes.
//variables are the data. Variables are called properties.
//methods are the functions aka the intructions that operate on the data.
public class Spaceship { // The class starts here.
    
    //Create a private string variable to hold a description of the spaceship.
    //This is called a property of the class.
    private String Description;

    // Create a constructor for the class that takes a string parameter called description.
        //This is a special method that is called when you create an object of the Class.
        //The constructor is used to initialize the properties of the class.
        //The constructor has the same name as the class.
        //The constructor does not have a return type.
        public Spaceship(String description){
            // Initialize the Description property 
            //by setting it to the value passed in the description parameter
            // x= 10;
            Description = description;
        }

        //Create a method to display the value of the description property on the screen.
        public void DisplayDescription(){
            // Display the value of the Description property
            System.out.println(Description);
        }

}// The Class ends here. 

