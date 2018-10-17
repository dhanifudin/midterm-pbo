/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author YOGA
 */
public class PromoItem extends Item {
    //atribut
    private float promo;
    
    //method PromoItem
    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    //Method getTotalPrice
    public float getTotalPrice() {
        return (price * amount) -(amount * promo);
    }
    
    //Method toString 
    @Override
    public String toString() {
        return "|" + (name) + "\t\t" + (price) + "\t\t|" + (amount) + "\t\t|" + getTotalPrice() + "\t|" + "\n" + "|" + "-Promo" + "\t\t" + (promo) + "\t\t|" + "\t\t|" + "\t\t|";
    }
}
