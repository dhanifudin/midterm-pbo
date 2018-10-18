package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Item {
    //membuat atribut 
    protected String name;
    protected float price;
    protected int amount;
    
    //membuat constructor
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    //method untuk menghitung total
    public float getTotalPrice(){
        return (int)price * amount;
    }
    
    //method untuk menampilkan 
    @Override
    public String toString(){
        return "|"+name+" \t\t"+price+" \t|"+amount+" \t\t|"+(price * amount)+"\t|";
    }
}
