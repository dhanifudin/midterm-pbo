/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Mery Kris
 */
public class DiscountItem extends Item {
    protected float discount;
    
    //konstruktor dari class DiscountItem
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }  

    //method untuk menghitung diskon
    public float getDiscount() {
        return getTotalPrice()*discount;
    }
    
    //method untuk menghitung total harga yang sudah mendapatkan diskon
    public float getTotal() {
        return getTotalPrice() - getDiscount();
    }
    
    //method ini untuk menampilkan output
    @Override
    public String toString(){
        return "| " + getName() + " \t\t| " + getPrice() + " \t| " + getAmount() + " \t\t| " + getTotal() + " \t|"
                + "\n|-Discount\t" + discount * 100+"%\t\t|\t\t|\t\t|";
    }
}
