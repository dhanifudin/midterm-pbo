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

    public Item(String name, float price, int amount) { // construktor
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) { // setting nama
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) { // setting harga
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) { // setting jumlah
        this.amount = amount;
    }
    @Override
    public String toString(){ // override
        return "| "+name+"\t\t| "+price+"\t|"+amount+"\t\t|"+getTotalPrice()+"\t|";        
        // menampilkan nama,harga,jumlah dan total harga dari Objek Item yang di deklarasikan nilainya di MidtermTest.java
    }
   
    public float getTotalPrice(){ // override
        return this.price*this.amount;
        // melakukan perhitungan , harga * jumlah untuk mendapatkan hargaTotal

    }
}
