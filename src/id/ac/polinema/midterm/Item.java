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
    // menambahkan atribut yang acess modifier nya protected
    // karena akses protected dapat diakses hanya oleh class yang memilikinya saja
    // dan juga class yang merupakan keturunannya
    protected String name;
    protected float price;
    protected int amount;

    public Item(){
        
    }
    
    // membuat construcor
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    // membuat getter totalPrice untuk mendapatkan harga total yanng didapat dari harga satuan
    // barang dikalikan jumlah beli
    public float getTotalPrice(){
        return price * amount;
    }
    
    public String toString(){
        return name;
    }
}
