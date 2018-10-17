/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author MSI Notebook
 */
public class DiscountItem extends Item {
    
    private float discount ;

    public DiscountItem(String name, float price, int amount , float diskon) {
        super(name, price, amount);
        this.amount = amount ;
    }
    
    
}
