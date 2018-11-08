/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author RADEON
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem() {
    }

    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    public float getTotalDiscount(){
        return (price*amount)-(price * amount * discount);
    }
    public float getDiscount(){
        return discount * 100;
    }
    
}
