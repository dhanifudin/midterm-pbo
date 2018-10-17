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

    protected String name ;
    protected float price ;
    protected int amount ;
    
    
    public Item(String name , float price , int amount) {
        this.name = name ;
        this.price = price ;
        this.amount = amount ;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public float getTotalPrice() {
        return (amount*price) ;
    }
    
    @Override
    public String toString() {
        return "|" + (name) + "\t\t|" + (price) + "\t|" + (amount) + "\t\t|" + (price*amount)+ "/|" ;
    }
    

    
           
}

