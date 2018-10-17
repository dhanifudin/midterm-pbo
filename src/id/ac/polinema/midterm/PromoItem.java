/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author KINTUL
 */
class PromoItem extends Item{
    protected float promo;
    
    public PromoItem(){
        
    }

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = (price - promo) * amount;
    }
    
    
}
