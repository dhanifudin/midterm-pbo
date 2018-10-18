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
        return price*amount;    //Berfungsi untuk menghitung jumlah dari harga yang sudah di kalikan dengan jumlah
    }
    
    public void setName(String name){
        this.name = name;   //Befungsi untuk menambahkan nilai pada var name
    }
    
    public String getName(){
        return name;    //Berfungsi untuk mengembalikan nilai dari var name
    }
    
    public void setPrice(float price){
        this.price = price; //Hampir sama seperti method di atasnya hanya saja untuk set harga
    }
    
    public float getPrice(){
        return price;   //Sama seperti method get di atasnya hanya saja untuk get harga
    }
    
    public void setAmount(int amount){
        this.amount = amount;   //Sama seperti method set di atasnya hanya saja untuk set jumlah
    }
    
    public int getAmount(){
        return amount;  //Sama seperti method get di atasnya hanya saja untuk get jumlah
    }
    
    @Override
    public String toString(){
        tostring = "| "+this.name+"\t\t| "+this.price+"\t| "+this.amount+"\t\t| "+getTotalPrice()+"\t|";
        return tostring;
    }  
}
