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
/**
 *
 * @author USER
 */
public class orderControl {
    ArrayList<Order> order;
//    Customer activeCustomer;
    appControl controller;
   
   
    
    public orderControl(){
       
        order = new ArrayList();
        controller = new appControl();
    }
 
    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setCart(ArrayList<Order> cart) {
        this.order = order;
    }

    public void addToOrder(String iname,int iquantity){
        Order o = new Order(iname,iquantity);
        order.add(o);
    }
   


    
    
    
    
    public String printCart(){
        String s ="";
        for(int i = 0; i<order.size(); i++){
            s+= order.get(i).getFname()+"\t"+order.get(i).getFquantity()+"\t";
            s+= controller.getFoodPrice(order.get(i).getFname())+"\n";
        }
        return s;
    
    }
    
    public void removeFromCart(String iname){
        for(int i = 0; i<order.size(); i++){
            if(order.get(i).getFname().equals(iname))
                order.remove(i);
        }
    }
    
    
    public void empty(){
        order.removeAll(order);
    }

    public int countItems(){
        int num = 0;
        for(int i=0; i<order.size();i++){
            num+=order.get(i).getFquantity();
        }
            return num;
       
       
    }

public Double estimatePrice(){
        double sum = 0.0;
        for(int i = 0; i<order.size(); i++){
            String name = order.get(i).getFname(); 
            double p = controller.getFoodPrice(name);
            int qnt = order.get(i).getFquantity();
            sum += p*qnt;
        }
        return sum;
    }

}

