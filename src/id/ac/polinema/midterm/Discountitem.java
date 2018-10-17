/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author jajal
 */
public class Discountitem extends Item{
    private float discount;

    public Discountitem(float discount) {
        this.discount = discount;
    }

    public Discountitem(float discount, String name, float price, int amount) {
        super(name, price, amount);
        this.discount = discount;
    }
          
    
}
