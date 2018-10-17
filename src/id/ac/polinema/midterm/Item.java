package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class Item {
    protected String Name;
    protected float Price;
    protected int amount;
    
    public Item(){
        
    }

    public Item(String Name, float Price, int amount) {
        this.Name = Name;
        this.Price = Price;
        this.amount = amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Nama) {
        this.Name = Name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public float getTotalPrice(){
        return Price;
    }
    public String toString(){
        return Name ;
   
    }
    
    

}
