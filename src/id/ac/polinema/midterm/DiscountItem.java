/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author iloops
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(float discount, String nama, float price, int amount) {
        super(nama, price, amount);
        this.discount = discount;
    }
    
    
}
