/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import View.*;
import beans.*;
import java.io.PrintWriter;


/**
 *
 * @author pewst
 */
public class cityofaaron 
{
    //variable for keeping a reference to the game object
    private static Game theGame = null;

    //getters and setters
    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        cityofaaron.theGame = theGame;
    }
    
    

    //main function - entry point for the program
    //runs the main menu
    public static void main(String[] args) 
    {               
        
        MainMenuView mmv = new MainMenuView();
        mmv.DisplayMenuView();
        
              
    }
    
}
