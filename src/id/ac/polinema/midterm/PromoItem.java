/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author hp
 */
public class PromoItem extends Item { // menurunkan atribut dari Class Item
    
    float promo;

    public PromoItem() { // constraktor PromoItem
    }

    public PromoItem(String nama, float price, int amount, float promo) { // Parameter PromoItem
        super(nama, price, amount);
        this.promo = promo;
    }
    
    @Override
    public float getTotalPrice(){ // rumus menghitung jumlah Harga Promo
       return price*amount - (promo*amount);
    }
}
