/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USER
 */
public class Drink {
     private String drinkName;
      private Double drinkPrice;
      

    public Drink(String itemName, Double itemPrice) {
        this.drinkName = itemName;
        this.drinkPrice = itemPrice;
        //this.totalQuality = totalQuality;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public Double getDrinkPrice() {
        return drinkPrice;
    }

//    public int getTotalQuality() {
//        return totalQuality;
//    }

    public void setDerinkName(String itemName) {
        this.drinkName = itemName;
    }

    public void setDrinkPrice(Double itemPrice) {
        this.drinkPrice = itemPrice;
    }

//    public void setTotalQuality(int totalQuality) {
//        this.totalQuality = totalQuality;
//    }
         @Override
    public String toString(){
        return this.drinkName + "\t" + this.drinkPrice + "\t" ;
    }
    
}
