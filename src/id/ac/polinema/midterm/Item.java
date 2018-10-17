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
    
    //menambahkan constructor
    public Item(String nama, float price, int amount) {
        this.nama = nama;
        this.price = price;
        this.amount = amount;
    }
    
    //menambahkan method total harga
    public float getTotalPrice(){
       float totalprice = price * amount;
       return totalprice; 
    }
    
    //menambahkan method untuk menampilkan isi
    public String toString(){
        return ;
    }
}
