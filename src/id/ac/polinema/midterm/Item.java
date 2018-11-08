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

    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    public String getName() {
        return name;
    }
//Method get untuk mengambil nilai yang ada
    public float getPrice() {
        return price;
    }


    public int getAmount() {
        return amount;
    }
    
    
    public float GetTotalprice(){
        return (this.price*this.amount);
    }
    //Menghitung nilai keseluruhan
    
    public String toString(){
        String print = "";
        print += "|"+this.name+"\t\t|"+this.price+"\t|"+this.amount+"\t\t|"+GetTotalprice()+"|";
        return print;
    }
    //menampilkan nilai pada kolom pertama
}
