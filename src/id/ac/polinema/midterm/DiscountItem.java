/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author WINDOWS 10
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String name, int price, float amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    
}
