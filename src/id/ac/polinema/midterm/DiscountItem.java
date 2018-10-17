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
class DiscountItem extends Item {
    private float discount;
    
    public DiscountItem(){
        
    }

    public DiscountItem(String nama, float price, int amount, float promo) {
        super(nama, price, amount);
        this.discount = discount;
    }
    
    @Override
    public float getTotalPrice(){
       return price*amount-(discount*price*amount); 
    }
    
    
}
