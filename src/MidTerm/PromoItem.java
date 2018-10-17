/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidTerm;

/**
 *
 * @author Arifanny Ramadhan Sukma / 1741720217 / TI=2A
 */
public class PromoItem extends Item {
    private float promo;

    public PromoItem(String name, float price, int amount, float promo) {
    super(name, price, amount);
    this.promo = promo;
    }
    
    
}
