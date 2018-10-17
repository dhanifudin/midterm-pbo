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
public class DiscountItem {

    private float discount;
    private String name;
    private float price;
    private int amount;

    public DiscountItem(String name, float price, int amount, float discount) {
        this.discount = discount;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public DiscountItem(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float DiscountItem() {
        discount = price - (price * amount * discount);
        return discount;
    }

}
