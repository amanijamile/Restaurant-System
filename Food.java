/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. esem l akle w se3ra w category/drink, main plate, app
 */
package Model;

/**
 *
 * @author USER
 */
public class Food {
     private String foodName;
      private Double foodPrice;
        private int totalQuality;

    public Food(String itemName, Double itemPrice) {
        this.foodName = itemName;
        this.foodPrice = itemPrice;
        //this.totalQuality = totalQuality;
    }

    public String getFoodName() {
        return foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

//    public int getTotalQuality() {
//        return totalQuality;
//    }

    public void setFoodName(String itemName) {
        this.foodName = itemName;
    }

    public void setFoodPrice(Double itemPrice) {
        this.foodPrice = itemPrice;
    }

//    public void setTotalQuality(int totalQuality) {
//        this.totalQuality = totalQuality;
//    }
         @Override
    public String toString(){
        return this.foodName + "\t" + this.foodPrice + "\t" + this.totalQuality;
    }
}



    

