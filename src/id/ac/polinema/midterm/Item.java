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
    protected String name; // Menambahkan atribut name dengan tipe data String yang hanya bisa di akses oleh anaknya / warisan
    protected float price; // Menambahkan atribut price dengan tipe data float yang hanya bisa di akses oleh anaknya / warisan
    protected int amount; // Menambahkan atribut amount dengan tipe data int yang hanya bisa di akses oleh anaknya / warisan

    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    // Mengambil nilai dari class Main ke dalam class ini yang di masukkan ke atribut name, price, amount
    
    public float getTotalPrice(){
        return (amount*price);
    }
    // Menghitung total harga
    
    @Override
    public String toString(){
        return "|"+(name)+"\t\t| "+(price)+"\t| "+(amount)+"\t\t| "+getTotalPrice()+"\t|";
    }
    // Representasi data berupa String dengan ketentuan sebagai berikut
    // Pada class ini yang menggunakan method toString() melakukan override

}
