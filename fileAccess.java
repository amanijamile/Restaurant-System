/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import Model.*;


public class fileAccess {
    public void writeToFile(String fileName, String string){
        try{
            FileWriter f = new FileWriter(fileName+".txt", true);
            f.write(string);
            f.close(); 
        }
        catch(IOException e){
        }
    }
    
    
    
public static void AddOrder(String order) {


            try {
                FileWriter appoint = new FileWriter("Orders.txt", true);
                appoint.write(order + "\n");
                appoint.close();
            } catch (IOException ioe) {
            }
        

    }



    
    
public void Rejected(String reject) {


            try {
                FileWriter appoint = new FileWriter("Rejected.txt", true);
                appoint.write(reject + "\n");
                appoint.close();
            } catch (IOException ioe) {
            }
        

    }
    
    
    
    public void resetFile(String fileName){
        try{
            FileWriter fw = new FileWriter(fileName+".txt", false);
            fw.close();
        }
        catch(IOException e){
        }
    }
    
    
    public ArrayList<Food> readFoods(){
        ArrayList<Food> allfoods = new ArrayList();
        String line;
        String info[];
        try{
            FileInputStream fs = new FileInputStream("food.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while(in.ready()){
                line = in.readLine();
                info = line.split("\t");
                Food f = new Food(info[0],Double.parseDouble(info[1]));
                allfoods.add(f);
            } in.close();
        }
        catch(IOException e){}
        return allfoods;
        
    }
    public ArrayList<Drink> readDrinks(){
        ArrayList<Drink> alldrinks = new ArrayList();
        String line;
        String info[];
        try{
            FileInputStream fs = new FileInputStream("Drinks.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while(in.ready()){
                line = in.readLine();
                info = line.split("\t");
                Drink d = new Drink(info[0],Double.parseDouble(info[1]));
                alldrinks.add(d);
            } in.close();
        }
        catch(IOException e){}
        return alldrinks;
        
    }
    
    public ArrayList<Appetizier> readAppetizier(){
        ArrayList<Appetizier> allAppetizier = new ArrayList();
        String line;
        String info[];
        try{
            FileInputStream fs = new FileInputStream("Appetizier.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while(in.ready()){
                line = in.readLine();
                info = line.split("\t");
                Appetizier d = new Appetizier(info[0],Double.parseDouble(info[1]));
                allAppetizier.add(d);
            } in.close();
        }
        catch(IOException e){}
        return allAppetizier;
        
    }
    
    
    public ArrayList<Waiter> readWaiters(){
       int i =0;
        ArrayList<Waiter> allwaiters = new ArrayList();
            String line;
            String cinfo[];
            try{
                FileInputStream fs = new FileInputStream("Waiter.txt");
                InputStreamReader ir = new InputStreamReader(fs);
                BufferedReader in = new BufferedReader(ir);
                while(in.ready()){
                    line = in.readLine();
                    cinfo = line.split("\t");
                    Waiter ai = new Waiter(cinfo[0],cinfo[1]);
                    allwaiters.add(ai);
                  //  System.out.println(ai);
                  //  i++;
               }
                
                in.close();
        }
        catch(IOException e){}
            
        return allwaiters;
    }
    
    public ArrayList<Order> readOrder(){
        ArrayList<Order> allorders = new ArrayList();
        return allorders;
}

    String[][] getFoodInfo(int rowCount) {
        String [][] data = new String[rowCount][4];
        String cinfo[];
        String line ="";
        int row = 0;
        try{
            
       
            FileInputStream fs = new FileInputStream("foods.txt");
            InputStreamReader ir = new InputStreamReader(fs);
            BufferedReader in = new BufferedReader(ir);
            while(in.ready()){
                line = in.readLine();
                cinfo = line.split("\t");
                data[row][0] = cinfo[0];
                data[row][1] = cinfo[1];
            //data[row][2] = cinfo[2];
//            if(cinfo[2].equals("0")){
//                data[row][3] = "out of stock";
//            }
            row++;
            }
            in.close();
            }
//        
      catch(IOException e){}
        return null;
     
    }
}

    

