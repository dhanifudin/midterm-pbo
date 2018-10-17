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
public class DiscountItem extends Item {
    //atribut
    private float discount;
    
    //method DiscountItem
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    //method getTotalPrice
    @Override
    public float getTotalPrice() {
        return (price * amount) - (price * amount * discount);
    }
    
    //method toString
    @Override
    public String toString() {
        return "|" + (name) + "\t\t" + (price) + "\t\t|" + (amount) + "\t\t|" + getTotalPrice() + "\t|" + "\n" + "|" + "-Disc" + "\t\t" + (discount*100) + " %" + "\t\t|" + "\t\t|" + "\t\t|";
    }
}
