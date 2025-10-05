/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.File;
import java.lang.String;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Model.*;
import View.WaiterFrame;

/**
 *
 * @author USER
 */
public class appControl {
    fileAccess fa;
    
    public appControl(){
        fa = new fileAccess(); 
    }
    
    public Boolean addFood(String name, double price){
        
         ArrayList<Food> allfoods = fa.readFoods();
        for(int i=0;i< allfoods.size();i++){
            if(allfoods.get(i).getFoodName().equals(name)){
                return (false);
            }
            
        }
        Food f = new Food(name, price);
        fa.writeToFile("food" , f.toString() + "\n");
        return(true);
    }
    
    
    
    
     public ArrayList<Drink> getDrinklist(){
         System.out.println(fa.readDrinks());
        return fa.readDrinks();
    }
     
      public ArrayList<Appetizier> getAppetizierlist(){
         System.out.println(fa.readAppetizier());
        return fa.readAppetizier();
    }
    
     
     
    public Boolean addDrink(String name, double price){
        
         ArrayList<Drink> alldrinks = fa.readDrinks();
        for(int i=0;i< alldrinks.size();i++){
            if(alldrinks.get(i).getDrinkName().equals(name)){
                return (false);
            }
            
        }
        Drink d = new Drink(name, price);
        fa.writeToFile("Drinks" , d.toString() + "\n");
        return(true);
    }

    public Boolean addAppetizier(String name, double price){
        
         ArrayList<Appetizier> allAppetizier = fa.readAppetizier();
        for(int i=0;i< allAppetizier.size();i++){
            if(allAppetizier.get(i).getAppetizierName().equals(name)){
                return (false);
            }
            
        }
        Appetizier d = new Appetizier(name, price);
        fa.writeToFile("Appetizier" , d.toString() + "\n");
        return(true);
    }

    
    
    public void addCustomer(String name, String pass) {
        Customer c = new Customer(name,pass);
        fa.writeToFile("costumers", c.toString() +"\n");
    }
    
    public void addWaiter(String name, String pass) {
        Waiter c = new Waiter(name,pass);
        fa.writeToFile("Waiter", c.toString() +"\n");
    }
    
    
   
    public void addOrder(ArrayList<Order> order) {
        for(int i = 0; i<order.size();i++){
            fa.writeToFile("Order", order.get(i).toString()+"\n");
        }
        
    }
    
    public ArrayList<Food> getFoodlist(){
        return fa.readFoods();
    }
    
 public int getFoodCount(){
        return fa.readFoods().size();
    }
    
    
     public ArrayList<String> getallFoodNames(){
         ArrayList<String> out = new ArrayList();
         ArrayList<Food> allfoods = fa.readFoods();
          for(int i = 0; i<allfoods.size(); i++){
              out.add(allfoods.get(i).getFoodName());
              
          }
          return out;
     }
    
    
     public ArrayList<String> getallDrinksNames(){
         ArrayList<String> out = new ArrayList();
         ArrayList<Drink> allDrinks = fa.readDrinks();
          for(int i = 0; i<allDrinks.size(); i++){
              out.add(allDrinks.get(i).getDrinkName());
              
          }
          return out;
     }
     
      public ArrayList<String> getallAppNames(){
         ArrayList<String> out = new ArrayList();
         ArrayList<Appetizier> allApp = fa.readAppetizier();
          for(int i = 0; i<allApp.size(); i++){
              out.add(allApp.get(i).getAppetizierName());
              
          }
          return out;
     }
     
     
    
    public String PrintAllFoods(){
        String s = "";
        ArrayList<Food> allfoods = fa.readFoods();
        for(int i = 0; i<allfoods.size(); i++){
            s+= allfoods.get(i).toString() +"\n";
        }
        return s;
    }
    public String PrintAllAppetizier(){
        String s = "";
        ArrayList<Appetizier> allAppetizier = fa.readAppetizier();
        for(int i = 0; i<allAppetizier.size(); i++){
            s+= allAppetizier.get(i).toString() +"\n";
        }
        return s;
    }
    public String PrintAllDrinks(){
        String s = "";
        ArrayList<Drink> allDrinks = fa.readDrinks();
        for(int i = 0; i<allDrinks.size(); i++){
            s+= allDrinks.get(i).toString() +"\n";
        }
        return s;
    }
    
//    public int getItemQuantity(String name) {
//        
//        int q = 0;
//         ArrayList<Food> allfoods = fa.readFoods();
//         for(int i = 0; i<allfoods.size(); i++){
//            if(allfoods.get(i).getItemName().equals(name)){
//                    q = allfoods.get(i).getTotalQuality();
//                }
//            }
//         return q;
//    }
     public double getFoodPrice(String name){
        double p = 0.0;
        ArrayList<Food> allfood = fa.readFoods();
        for(int i = 0; i<allfood.size(); i++){
            if(allfood.get(i).getFoodName().equals(name))
                p += allfood.get(i).getFoodPrice();
        }
        return p;
    }
     
     public double getDrinkPrice(String name){
        double p = 0.0;
        ArrayList<Drink> alldrink = fa.readDrinks();
        for(int i = 0; i<alldrink.size(); i++){
            if(alldrink.get(i).getDrinkName().equals(name))
                p += alldrink.get(i).getDrinkPrice();
        }
        return p;
    }
     
     public double getAppPrice(String name){
        double p = 0.0;
        ArrayList<Appetizier> allapp = fa.readAppetizier();
        for(int i = 0; i<allapp.size(); i++){
            if(allapp.get(i).getAppetizierName().equals(name))
                p += allapp.get(i).getAppetizierPrice();
        }
        return p;
    }
     
     
     public boolean checkWaiter(String uname, String pass ){
        boolean access = false;
        ArrayList<Waiter> allwaiters;
        allwaiters = fa.readWaiters();

        for(int i = 0; i<allwaiters.size();i++){
           if(allwaiters.get(i).getName().equalsIgnoreCase(uname) && allwaiters.get(i).getPass().equalsIgnoreCase(pass)){
               access = true;
              
           }
        }
        return access;
    }
//      public void reduceFoodQuantity(ArrayList<Order> order) {
//        String name;
//        int quant;
//        ArrayList<Food> allfoods = fa.readFoods();
//        for(int i = 0; i<order.size(); i++){
//            name = order.get(i).getIname();
//            quant = order.get(i).getIquantity();
//            for(int j = 0; j<allfoods.size(); j++){
//                int q;
//                if(allfoods.get(j).getItemName().equals(name)){
//                q = allfoods.get(j). getTotalQuality();
//                q = q - quant;
//                allfoods.get(j). setTotalQuality(q);
//                }
//            }
//        }
//
//        fa.resetFile("Food");
//        for(int i = 0; i<allitems.size();i++)
//            fa.writeToFile("foods", allitems.get(i).toString() +"\n");
//        
//    }

    public String[][] getFooddata() {
       int row = this.getFoodCount();
       String [][] data = fa.getFoodInfo(row);
       return data;
    }

}
    

