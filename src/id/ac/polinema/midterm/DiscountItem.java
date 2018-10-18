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
public class DiscountItem extends Item{
    private float discount; // Membuat atribut discount dengan tipe data float yang hanya bisa di akses class itu sendiri
    
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    // Mengambil nilai dari atribut name, price, amount (class parent), discount
    
    @Override
    public float getTotalPrice(){
        return (price * amount) - (price * amount * discount);
    }
    // Menghitung discount
    
    @Override
    public String toString(){
        return "|"+(name)+"\t\t| "+(price)+"\t| "+(amount)+"\t\t| "+getTotalPrice()+"\t|"+"\n"+"|"+"-Disc"+"\t\t| "+discount*100+" %"+"\t\t| "+"\t\t|"+"\t\t| ";
    }
    // Representasi data berupa String dengan ketentuan sebagai berikut
    // Pada class ini yang menggunakan method toString() melakukan override
}
