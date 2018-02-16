/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260Control;

import java.util.Random;
import CIT260.Lesson4.Game;
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
public static int calcLandCost(){
    int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
    return landPrice;
}

// Purpose: Buy land
    
// Parameters: The price of land and the number of acres to buy

// Returns: The amount of land after the purchase & The amount of wheat after purchase
public int buyLand(int priceOfLand, int acresToBuy, CropData, cropData){
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
    int owned = cropData.getAcresOwned();
    if(acresToBuy*priceOfLand > acresOwned)
        return -1;        
//acresOwned = acresOwned + acresToBuy
    owned += acresToBuy;
    cropData.setAcresOwned(owned);
//wheatInStore = wheatInStore – (acresToBuy*priceOfLand)
    int wheat = cropData.getWheatInStore();
    wheat -= (acresToBuy * priceOfLand);
    cropData.setWheatInStore(wheat);
//return acresOwned
    return owned;
}

@Test
    public void testBuyLand(){
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        int toBuy = 10;
        int landPrice = 15;
        int expResult = 2790;
        int result = CropDataControl.buyLand(landPrice, toBuy, theCrops);
        assertEquals(expResult, result);
    }
}