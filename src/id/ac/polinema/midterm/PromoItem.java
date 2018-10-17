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
public class PromoItem extends Item{
    private float promo;

    public PromoItem(float promo) {
        this.promo = promo;
    }

    public PromoItem(String name, float price, int amount,float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    
}
