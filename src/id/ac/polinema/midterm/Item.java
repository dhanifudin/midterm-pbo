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
    protected String name;
    protected int price;
    protected float amount;

    public Item() {
    }

    public Item(String name, int price, float amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    public float getTotalPrice(){
        return (int)(amount*price);
    }
    
    @Override
    public String toString(){
        return "|"+(name)+" \t\t|"+(price)+"\t\t|"+(amount)+"\t\t|"+(price*amount)+"\t\t|";
    }    
}
