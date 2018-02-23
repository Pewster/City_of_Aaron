/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.cityofaaron.control;

import java.util.Scanner;
import java.util.Random;
import CIT260.cityofaaron.beans.CropData;
/**
 *
 * @author Kol24
 */

//CropControl class
public class CropControl {

//Random number generator
private static Random random = new Random();

//minimum and range of price per acre constants
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;

//calcLandCost() Method
//purpose: Calculate a random land price between 17 and 26 bushel's per acre
//returns landPrice
public static int buyLand(){
    int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
    return landPrice;
}

// Purpose: Buy land
    
// Parameters: The price of land and the number of acres to buy

// Returns: The amount of land after the purchase & The amount of wheat after purchase
public int buyLand(int priceOfLand, int acresToBuy, CropData){
/*The problem to be solved:
The currency is wheat and the price of land is random. If the price of land is p and the acres we want to buy is a, then the number of acres we can buy is the wheatInStore, w divided by the priceOfLand.  The acres owned is o and is the product of the price of land and the acres to buy.
a = w / p
p x a + o = o
**o = o + a; AND w = w - (p x a)**
*/
/*Pre-Conditions:  The number of acres you want to buy cannot be negative
     You must have enough wheat to buy the land
 		     You must have enough people to tend the land
*/
//If the number of acres to buy is negative this is an error; Return o -1
    if(acresToBuy < 0)
        return -1;
//if wheatInStore < acresToBuy * priceOfLand < zero, return -1
    int owned = CropData.getAcresOwned();
    if(acresToBuy*priceOfLand > owned)
        return -1;        
//acresOwned = acresOwned + acresToBuy
    owned += acresToBuy;
    CropData.setAcresOwned(owned);
//wheatInStore = wheatInStore – (acresToBuy*priceOfLand)
    int wheat = CropData.getWheatInStore();
    wheat -= (acresToBuy * priceOfLand);
    CropData.setWheatInStore(wheat);
//return acresOwned
    return owned;
}

//Test
    public void testBuyLand(){
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        int toBuy = 10;
        int landPrice = 15;
        int expResult = 2790;
        int result = buyLand(landPrice, toBuy, theCrops);
    }

// to feed the people by joseph orton(Kol24)
    
//Pseudo-code for public int feedPeople(wheatInStore, wheatForPeople, population) method:
    public int feedPeople(int wheatInStore, CropData cropData){
        int wheatForPeople;
//if wheatForPeople < 0, return -1
        if(wheatForPeople < 0)
            return -1;
//if wheatInStore < wheatForPeople return -1
    int wheatInStore = cropData.getWheatInStore();
        if(wheatForPeople > wheatInStore)
            return -1;
//wheatInStore = wheatInStore - wheatForPeople
    wheatInStore -= wheatForPeople
    cropData.setWheatInStore(wheatInStore);
// wheat for people
    cropData.setWheatForPeople();
//return wheatInStore
    return wheatInStore;
    }
//PayOffering
//Max Scott
    
 /*
    The user enters the percentage of the harvest they want to pay in offerings. The method makes sure that the value is a positive number less than 100 and saves the value. 
    
   
    
    */   
    public static int payOffering(int harvest)
    {
       // Ask user the percentage. Don't take anything below 0 or above 100. 
        
        System.out.println("What percentage of the harvest will you offer? ");
            
        Scanner pc = new Scanner(System.in);
        int percentage = pc.nextInt();
        //I'll declare offering here, but assign it a value in the if statements. 
        int offering = 0;     
        
        
        
        if(percentage > 0 && percentage < 100)
        {
            offering = harvest * (percentage / 100);
            System.out.println("You've offered "+offering+" bushels from your harvest.\n");  
        }
        
        else
        {
         System.out.println("You must give a valid offering. What percentage of your harvest will you give? ");     
        
         percentage = pc.nextInt();
            if(percentage > 0 && percentage < 100)
           {
               offering = harvest * (percentage / 100);
               System.out.println("You've offered "+offering+" bushels from your harvest.\n");  
           }
        }
      return offering;
    }
    
    
    public static int acresPlanted(int population, int wheatInStore, int acresOwned) 
    {
         
         // Code by Hayden Pew
         /* Purpose : To determine how many acres can be planted
         
         Problem : To determine the number of acres to be planted. 
         You must have enough wheatInStore because it takes 
        1/2 bushels for each acre planted. And the number 
        of acres planted cannot be more then the population
        times 10 because each citizen can work up to 10 acres.
        There also must be enough acres owned, so the number
        of potential acres to be planted is the population 
        times ten and if that is less then or equal to the 
        acresOwned then it will work */
         
        int acresByWheat = wheatInStore * 2;
        int acresByPop = population *10;
        
        if (acresByWheat > acresOwned && acresByPop > acresOwned)
        { 
            return acresOwned;
        }
        else if (acresByWheat < acresOwned && acresByWheat < acresByPop)
        {
            return acresByWheat
        }
        else 
        {
            return acresByPop
        }
    }     
         
        
  
}