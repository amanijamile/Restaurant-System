/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. este customer pidio esta comida, comida
attribute de las otras clases
food 
customer
date
este va a ser table sin detalles

import java
 */
package Model;

/**
 *
 * @author USER
 */
public class Order {
      private String Fname;
    private String cname;
    private int iquantity;

    public Order(String iname, int iquantity) {
        this.Fname = iname;
        this.cname = cname;
        this.iquantity = iquantity;
    }


    


    public String getFname() {
        return Fname;
    }

    public String getCname() {
        return cname;
    }

    public int getFquantity() {
        return iquantity;
    }

    public void setFname(String iname) {
        this.Fname = Fname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setFquantity(int iquantity) {
        this.iquantity = iquantity;
    }
        @Override
    public String toString(){
        return this.Fname + "\t" + this.cname + "\t" + this.iquantity;
    }
    
}


