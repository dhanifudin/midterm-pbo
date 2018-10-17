/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author MEUTIA KHANANDIYA
 */
public class PromoItem {
    private float promo;
    
    public PromoItem(String name, float price, int amount, float promo){
        this.promo = promo;
    }

    public float getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }
}
