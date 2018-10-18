/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Anonymous
 */
public class PromoItem extends Item{
    private float promo; // Membuat atribut promo dengan tipe data float yang hanya bisa di akses class itu sendiri

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    // Mengambil data dari class main dengan atribut name, price, amount (class parent), promo
    
    @Override
    public float getTotalPrice(){
        return (price * amount) - (amount * promo);
    }
    // Menghitung harga promo
    
    @Override
    public String toString(){
        return "|"+(name)+"\t\t| "+(price)+"\t| "+(amount)+"\t\t| "+getTotalPrice()+"\t|";
    }
    // Representasi data berupa String dengan ketentuan sebagai berikut
    // Pada class ini yang menggunakan method toString() melakukan override
}
