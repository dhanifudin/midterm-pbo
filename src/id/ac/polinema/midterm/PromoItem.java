/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Bamz Dnr
 */
public class PromoItem extends Item{
    public float Promo;
    
    PromoItem(){
    }
    
    PromoItem (String name, float price, int amount, float Promo){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.Promo = Promo;
    }
    
    public float getTotalPrice(){
        return price*amount-(Promo*amount);
        
    }
}
