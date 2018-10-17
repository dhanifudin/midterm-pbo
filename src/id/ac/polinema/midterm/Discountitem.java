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
public class Discountitem extends Item {
    private float discount;

    public Discountitem(String name, float price, int amount, float discount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.discount = discount;
    }
    
}
