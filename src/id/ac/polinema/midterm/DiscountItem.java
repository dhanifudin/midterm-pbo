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
class DiscountItem extends Item { // menurunkan atribut dari Class Item
    float discount;
    
    public DiscountItem(){ //construktor DiscountItem
        
    }

    public DiscountItem(String nama, float price, int amount, float discount) { //Parameter DiscountItem
        super(nama, price, amount);
        this.discount = discount;
    }
    
    @Override
    public float getTotalPrice(){ //Rumus menghitung Diskon
       return price*amount-(discount*price*amount); 
    }
    
    public float getDiscount(){
      return discount * 100;  
    }
    
    
}
