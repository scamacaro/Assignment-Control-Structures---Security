/*
 Sanyerlis Camacaro - Sanyerliscamacaro@uat.edu - CSC203
 Assignment: Control Structures - Security.

 Objective:

Understand Data Types.
Understand Decisions.
Understand Control Structures.
Map the world around you using classes and objects.
Passwords.
 */

//This library allows us to use the Scanner class and get user input.
import java.util.Scanner;

// Create the Main class and main function for my java program
public class Main{// The class starts here.
    //Create the main function for my java program
    public static void main(String[] args) { // The main method starts here.

        //Display a title of Starbase 13 for the user.
        System.out.println("\n\n\t *** Mission: Starbase 13 ***\n\n");
       
       // Now above the description, add code that adds a computer greeting like "I am MACHINA X22, what is your name?" 
       //to the top of the user's display.
       // write code to get the user name and place it into a string variable.
       //adds a computer greeting like "I am MACHINA X22, a Programmed Algorithmic Computer, What is your name?"
       System.out.println("\nI am MACHINA X22, a Programmed Algorithmic Computer, What is your name? ");
       //Write code to get user name and place it into a string variable.
       Scanner input = new Scanner(System.in);
       String  userName = input.nextLine();

       // Create a new user object from the ClassUser class.
       ClassUser user = new ClassUser(userName, "Hanger");

        

       //Display message that identity is confirmed."
       System.out.println("\nIdentity confirmed. Thank You.");
       //Display the user name with a welcome message like "Hello User, Welcome to Starbase 13."
       System.out.println("\nHello, " + user.GetName() + ", Welcome to Starbase 13. We've been expecting you.");
       //Displays message of current year 2491. 
       System.out.println("\nCurrent Year is: 2491.");

        //Write code that displays a description of space SpaceX's new space station
        //"Starbase 13".
        // Story telling starts.
        System.out.println("\nStarbase 13 is the new building for scientific research inside SpaceX Spaceship.\n "); // LINE 1
        System.out.println("The mission of Starbase is to find extraterrestrial life while orbirting, and watching over planet EARTH.\n"); // LINE 2
        System.out.println("We believe that Extraterrestrials can guide us with advanced technology to help us save EARTH from global warming.\n"); // LINE 3
        System.out.println("This may seem like a scary mission because of the risks if we encounter dangerous Extraterrestrials.\n"); // LINE 4
        System.out.println("Only the best agents have access to our mission, and " + user.GetName() + " you are one of our BEST agents.\n"); // LINE 5
        System.out.println("We hope that you're READY for this mission because it STARTS in 3,2,1...\n"); // LINE 6
        
        // In the main function create at least four new different Area objects in main, ie Quarks bar, ie Holodeck, ie Hanger.
        // Create a new Area object called SpaceXCafe "QuarsBar".
        ClassArea SpaceXCafe= new ClassArea("SpaceXCafe is a cafe in the Space X Station. It's famous because of the delicious cappucinos and hang out spot", "SpaceXCafe");
        //Create a new Area object called SpaceFit "Holodeck".
        ClassArea SpaceFit = new ClassArea("The SpaceFit is a place to work out, and start a wellness journey." , "SpaceFit");
        //Create a new Area object called Hanger.
        ClassArea Hanger = new ClassArea("The Hanger is the place to hang out all day to network. ", "Hanger");
        // Create a new Area object called  RekCenter "Hanger".
        ClassArea RekCenter = new ClassArea("The RekCenter is the place for recreational activities, and famous for making new friends connections.", "RekCenter");
        // Create a new Area object called  SpaceQuater "Spaceport".
        ClassArea SpaceQuarter = new ClassArea("The Space Quarter is the place for resting, and to have a private space.", " Space Quarter");
        //Create a new Area object called SpaceMarket "Spaceyard"
        ClassArea SpaceMarket = new ClassArea("The Space Market is the place to buy local groceries and imported goods." ,"Space Market");
        //Creatte a new Area object called storge and make it secure
        ClassArea SpaceVault = new ClassArea("The Space Vault holds everyones assets. This area is password protective", "SpaceVault");


        // In the main function, create 5 new spaceship objects and enter a different one-sentence description for each.
        // Create a spaceship object called StarFalcon01 and pass in a description.
        Spaceship StarFalcon01 = new Spaceship("Star Falcon 01 is the flagship of the fleet.");
        //Create a spaceship object called StarFalcon02 and pass in a description.
        Spaceship StarFalcon02 = new Spaceship("Star Falcon 02 is the second ship made for 100 light years of travel distance.");
        //Create a spaceship object called StarFalcon03 and pass in a description.
        Spaceship StarFalcon03 = new Spaceship("Star Falcon 03 is the ship made to visit planet EARTH.");
        //Create a spaceship object called StarFalcon04 and pass in a description.
        Spaceship StarFalcon04 = new Spaceship("Star Falcon 04 is the newest ship, and the only that can resist VENUS temperature.");
        //Create a spaceship object called StarFalcon05 and pass in a description.
        Spaceship StarFalcon05 = new Spaceship("Star Falcon 05 is the oldest ship in the fleet, but it's the fastest.");

        // In the main function, create 5 new spaceship objects and enter a different one-sentence description for each.
        // Create a LifeForm object called MachinaX22 and pass in a description.
        LifeForm MachinaX22 = new LifeForm("Machina X-22 is a Computer Programmed Algorith that also has a body of a robot.");
        // Create a LifeForm object called Human01 and pass in a description.
        LifeForm Human01 = new LifeForm("The first agent to learn, and be accepted to the mission.");
        // Create a LifeForm object called Cyborg01 and pass in a description.
        LifeForm Cyborg01 = new LifeForm("The first human enhanced by computer implants.");
        // Create a LifeForm object called Captain01 and pass in a description.
        LifeForm Captain01 = new LifeForm("The Captain of Starbase Ship.");
        // Create a Lifeform object called Alien01 and pass in a description.
        LifeForm Alien01 = new LifeForm("The Alien from planet Xenus.");

       
        //Write a description of the hanger in the spaceport of the Starbase 13.
        // In this description use all 10 of your objects in your description of the hanger bay.
        System.out.println(user.GetName() + ", Thank you for accepting this mission.\n"); // Line 1.
        System.out.println("You are located at the new Hanger Bay of the space station.\n"); // Line 2.
        System.out.println("There are 5 Spaceships in the North Wing of the Hanger Bay.\n"); // Line 3.
        System.out.println("There are 5 Lifeforms in the South Wing of the Hanger Bay.\n"); // Line 4.
        System.out.println("Each Spaceships and Lifeforms are key to your survival, treat them wisely and kindly.\n"); // Line 5
        System.out.println("\nIn the NORTH WING You will find these 5 Spaceships: \n"); // Line 6

        System.out.println("\n\n");
        StarFalcon01.DisplayDescription(); // Displays Description of Spaceship 1.
        StarFalcon02.DisplayDescription(); // Displays Description of Spaceship 2.
        StarFalcon03.DisplayDescription(); // Displays Description of Spaceship 3.
        StarFalcon04.DisplayDescription(); // Displays Description of Spaceship 4.
        StarFalcon05.DisplayDescription(); // Displays Description of Spaceship 5.
        System.out.println("\n\n");

        // Display the name and description of each area in a story format.
        System.out.println(user.GetName());

        System.out.println("\nIn the SOUTH WING You will find these 5 LifeForms in the new Hanger Bay. Be careful, who you trust.\n"); // Line 1 of life form description. 
        System.out.println("\nThere are 1 robot, 3 humans and 1 alien.\n"); // Line 2
        System.out.println("\nThe first robot you see is\n "); // Line 3
        MachinaX22.DisplayDescription(); // Displays Machina X22 Description.
        

        System.out.println("\nThe first human you see is\n ");
        Human01.DisplayDescription(); // Displays Human01 Description.

        System.out.println("\nThe second human you see is\n ");
        Cyborg01.DisplayDescription(); // Displays Cyborg01 Description. 

        System.out.println("\nThe third human you see is\n ");
        Captain01.DisplayDescription(); // Displays Captain01 Description. 

        System.out.println("\nThe first alien you see is\n ");
        Alien01.DisplayDescription(); // Displays Alien01 Description. 


        // Display the menu for the user to choose from.
        user.DisplayMenu();
        
        
        System.out.println("\nWe hope you enjoyed the tour, and listened carefully. Everything you learn today will be part of YOUR mission.\n");
        System.out.println("\nClick DELETE to exit mission.\n"); // Exit Line.

    }
    // End main.The main methods ends here.
        
 } // End Starbase13 class.The main class ends here.


