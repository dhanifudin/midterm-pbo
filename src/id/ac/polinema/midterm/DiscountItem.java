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
public class DiscountItem extends Item{
    public float Discount;
    
    DiscountItem(){
    }
    
    DiscountItem(String name, float price, int amount, float Discount){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.Discount = Discount;
    }
}
