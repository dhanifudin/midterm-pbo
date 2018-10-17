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
    protected String name,tostring;
    protected float price;
    protected int amount;
    
    public Item(String name, float price, int amount){
        this.name = name;
        this.price = price;     
        this.amount = amount;
    }
    
    public float getTotalPrice(){
        return price*amount;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float getPrice(){
        return price;
    }
    
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public int getAmount(){
        return amount;
    }
    
    @Override
    public String toString(){
        tostring = "| "+this.name+"\t\t| "+this.price+"\t| "+this.amount+"\t\t| "+getTotalPrice()+"\t|";
        return tostring;
    }  
}
