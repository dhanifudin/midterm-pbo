/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Arifanny Ramadhan Sukma / 1741720217 / TI=2A
 */
public class Promoitem extends Item{
    private float promo;

    public Promoitem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
}
