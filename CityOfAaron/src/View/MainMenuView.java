/*  The MainMenuView class - part of the view layer
    This class is designed to manage the main menu
    Authors Hayden Pew, Max McMillan, Joseph Orton
    Date modified Feb 22 2018
*/

package View;

import java.util.Scanner;
import cityofaaron.cityofaaron; 
import beans.Game;

public class MainMenuView
{
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    /* the displayMenuView method
    purpose: display the menu, get user input and perform selected action
    parameters: none
    returns: none
    */
    
    mainMenu = "\n" +
            "****************************\n" +
            "  CITY OF AARON: Main Menu  " +
            "****************************\n" +
            " 1 - Start an new game\n" +
            " 2 - Continue a saved game\n" +
            " 3 - How to play\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n";
    max = 5;
    
    //  constructors for theMenu and max
    public MainMenuView(String theMenu, int max) {
        this.theMenu = theMenu;
        this.max = max;
    }
    
    public void displayMenuView()
    {
        int menuOption;
        do
        {
        //  1 Display the menu
        System.out.println(mainMenu);
        
        //  2 prompt user and get user input
        menuOption = getMenuOption();
        
        //  3 perform desired action
        daAction(menuOption);
        
        //  4 determine the next display
        } while (menuOption !=max);
        
    }
    
    // thegetMenuOption method
    // purpose: to get user input
    // parameters: none
    // returs: integer - the option selected
    public int getMenuOption()
    {
        // declare a variable to hold users input
        int userInput;
        // begin loop
        do
        {   
            //get user input from keyboard
            userInput = keyboard.nextInt();
            //if not a valid input, output error message
            if(userInput < 1 || userInput > max)
            {
                System.out.println("\noptionmust be netween 1 and " + max);
            }
        //loop back to top if input not valid
        } while(userInput < 1 || userInput > max);
               
        // return the value input by the user
        return userInput;
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
        switch(option)
        {
            case 1://create new game
                startNewGame();
                break;
            case 2://get and start a saved game
                startSavedGame();
                break;
            case 3://get help menu
                displayHelpMenuView();
                break;
            case 4:// save game
                displaySaveGameView();
                break;
            case 5://exit
                System.out.println("Thanks for playing ... goodbye");
        }
       
    }
    
    //The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startNewGame()
    {
        //create a new Game object
        Game theGame = new Game;
        
        //save a reference to it in the Game class.
        
    }
    
    //The startSavedGame method
    // Purpose: starts a saved game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame()
    {
        System.out.println("\nStart saved game option selected.");
    }
    
    //The displayHelpMenuView method
    // Purpose: displays the helpMenuView
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView()
    {
        System.out.println("\nHelp Menu option selected.");
    }
    
    //The  displaySaveGameVie method
    // Purpose: diaaplays the saveGameMenuView
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displaySaveGameView()
    {
        System.out.println("\nSave game option selected.");
    }
    
    
    
}
