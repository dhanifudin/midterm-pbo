/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author RADEON
 */
public class PromoItem extends Item{
    private float promo;

    public PromoItem() {
    }

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    public float getTotalPromo(){
        return (price - promo) * amount;
    }
    public float getPromo(){
        return promo;
    }
}
