import java.util.Scanner; // This allows us to us the Scanner class and get user input.

public class ClassUser { // The class starts here.
    // Create a property to hold the location of the user.
    private String Location;
    // Create a property to hold the name of the user.
    private String Name;

    // Create a constructor for the class.
    // This is a special method that is called when you create an object of the class.
    // The constructor is used to initialize the properties of the class.
    // The constructor has the same name as the class.
    // The constructor does not have a return type.
    public ClassUser(String name, String location){
        // Initialize the Description property by setting it to the value passed in the description parameter.
        // Our name will not change so we don't need a setter method.
        Name = name;
        // This will change so we need a setter method.
        Location = location;
    }

    // Create a getter method to return the value of the Name property.
    public String GetName(){
        // Return the value of the Name property.
        return Name;
    }

    // Create a getter method to return the value of the Location property.
    public String GetLocation(){
        // Return the value of the Location property.
        return Location;
    }

    // Create a setter method to set the value of the Location property.
    public void SetLocation(String location){
        // Set the value of the Location property.
        Location = location;
    }

    // Display a menu of options for the user to change their location.
    public void DisplayMenu(){// Start display menu method.
        
        // Create a boolean variable to control the loop.
        boolean exitLoop = false;

        // Create a loop to display the menu until the user chooses to exit.
        while (exitLoop == false){ // Start loop.

        
        // Display the menu title.
        System.out.println("\n*** Map of the Starbase 13 Station ***\n");
        // Display the current location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");


        // Display the menu 
        System.out.println("1. Go to the Hanger");
        System.out.println("Go to the RekCenter");
        System.out.println("Go to the SpaceFit");
        System.out.println("Go to the Space Market");
        System.out.println("Go to the Space Quarter");
        System.out.println("Go to the Space Vault");
        System.out.println("Go to the SpaceXCafe");
        System.out.print("Exit Starbase 13 Station");
        // ask the user to make a choice.
        System.out.println("\nPlease enter the number of the area you like to go: \n");

        // Create a scanner object to read input from the keyboard.
        Scanner input = new Scanner(System.in);
        // Read the user's input
        int choice = input.nextInt();

        // use a switch statement to determine which are the user wants to go to.
        switch (choice){
        case 1:
        // Set the location to the Hanger.
        SetLocation("Hanger");
        // Display the new location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");
        break;
        case 2:
        // Set the location to the RekCenter.
        SetLocation("RekCenter");
        // Display the new location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");
        break;
        case 3:
        // Set the location to the SpaceFit.
        SetLocation("SpaceFit");
        // Display the new location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");
        break;
        case 4:
        // Set the location to the Space Market.
        SetLocation("SpaceMarket");
        // Display the new location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");
        break;
        case 5:
        // Set the location to the Space Quarter.
        SetLocation("SpaceQuarter");
        // Display the new location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");
        break;
        case 6:
        // Set the location to the Space Vault.
        SetLocation("SpaceVault");
        // Display the new location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");
        break;
        case 7:
        // Set the location to the SpaceXCafe.
        SetLocation("SpaceXCafe");
        // Display the new location of the user.
        System.out.println("\tYou are currently in the " + Location + ".\n");
        break;
        case 8:
        // Set the exitLoop variable to true to exit the loop.
        exitLoop = true;
        System.out.println("\tYou have left Starbase 13 Space Station.");
        default:
        // Tell user that they entered an invalid choice and are in the same location.
        System.out.println("\tYou entered an invalid choice and are still in the"+ GetLocation() + "\n");
        break;

        }// End switch statement.
    } // End loop
        
    }// End display menu method.
}// End ClassUser class.
