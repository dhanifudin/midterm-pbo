/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Yulica
 */
public class PromoItem extends Item{
    private float promo;

    public PromoItem(String nama, float price, int amount, float promo) {
        super(nama, price, amount);
        this.promo = promo;
    }
    
    //menambahkan method total harga
    public float getTotalPrice(){
       float totalprice = price - promo;
       return totalprice; 
    }
    
    //menambahkan method untuk menampilkan isi
    public String toString(){
        String toString = "";
        
        return nama;
    }
    
}
