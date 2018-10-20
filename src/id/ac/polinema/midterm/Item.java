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
    protected String nama; //atribut dari
    protected float price; //atribut harga
    protected int amount; // atribut jumlah

    public Item() { //construktor item
    }

    public Item(String nama, float price, int amount) { //parameter dari item
        this.nama = nama;
        this.price = price;
        this.amount = amount;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
    
    
    
   public float getTotalPrice(){
       return price * amount;
   }
   
    @Override
public String toString(){
       return nama;
   }
}
