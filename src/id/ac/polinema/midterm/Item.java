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
    protected float price;
    protected int amount;

    //membuat konstruktor dari class Item
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    //menghitung total
    public float getTotalPrice(){
        return (int)(amount*price);
    }
    
    //method untuk menampilkan
    public String toString(){
        return "|"+(name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+(price*amount)+"\t|";
    }
    
}
