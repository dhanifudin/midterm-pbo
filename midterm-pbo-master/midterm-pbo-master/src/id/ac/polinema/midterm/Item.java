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
    protected String nama;
    protected float price;
    protected int amount;

    public String getNama() {   //getter nama
        return nama;
    }

    public void setNama(String nama) { //setter nama 
        this.nama = nama;
    }

    public float getPrice() {   //getter nama
        return price;
    }

    public void setPrice(float price) { //setter nama
        this.price = price;
    }

    public int getAmount() {    //getter nama
        return amount;
    }

    public void setAmount(int amount) { //setter jumlah
        this.amount = amount;
    }

    public Item(String nama, float price, int amount) { //constructor class Item
        this.nama = nama;
        this.price = price;
        this.amount = amount;
    }
    public Item (){ //constructor class item
        
    }
    @Override
    public String toString(){   //
        return null;
    } 
    
    public float getTotal(){
        return price * amount;  //perhitungan jumlah harga yang hgarus di bayar
    }
    
}
