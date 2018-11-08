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
    //menambahkan atribut nama bertipe String
    protected String nama;
    //menambahkan atribut price bertipe float
    protected float price;
    //menambahkan atribut amount bertipe int
    protected int amount;
    //menambahkan konstruktor
    public Item(String nama, float price, int amount) {
        this.nama = nama;
        this.price = price;
        this.amount = amount;
    }
    //fungsi getTotalPrice berfungsi untuk menghitung total harga
    public float getTotalPrice() {
        //mengembalikan nilai dengan mengkalikan price dan amount
        return price*amount;
    }
    //mengubah variable yang berada pada parrent class
    @Override
    public String toString() {
        return nama;
    }
}
