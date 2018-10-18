/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author HP
 */
public class PromoItem extends Item{
    //menambahkan atribut
    private float promo;
    
    //constructor untuk class promoItem
    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    //method untuk menghitung harga setelah mendapatkan promo
    public float getTotalPrice(){
        return (amount * price) - (promo * amount);
    }
    
    //untuk menampilka
    @Override
    public String toString(){
        return "|"+name+"\t\t|"+price+"\t|"+amount+"\t\t|"+getTotalPrice()+"\t|\n|-promo\t\t|"+promo+"%\t|\t\t|\t\t|";
    }
}
