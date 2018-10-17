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

    //di sini saya membuat konstruktor yang sama seperti di class Main agar tidak error
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }    
    
    //method ini berguna untuk memberi atau mencari harga total 
    public float getTotalPrice(){
    return amount*price; 
    }
    
    //method ini berguna seperti informasi informasi seperti yang ada di latihan soal pak
    @Override
    public String toString(){
        return "|" + (name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+(getTotalPrice())+"\t|"+"\n"+""; 
    }
    
            
    
}
