/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author khosy
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount*100;
    }
    
    public float getDiscount(){
        
        float disc = (this.discount/100) * (this.price*this.amount);
        return disc;
    }
    
    
    @Override
    public float getTotalPrice(){
        return this.amount * this.price -getDiscount();
    } 
    @Override
    public String toString(){
        return "|"+(this.name)+"\t\t|"+(this.price)+"\t|"+(this.amount)+"\t\t"+getTotalPrice()+"\t|"+"\n|-Disc"+"\t\t|"+this.discount+"%\t\t\t";
    }
   
    
    
}
