/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 * @author J I N G G A
 * next by Taufik
 */


public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String name, float price, int amount, float diskon) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    //method yang berfungsi untuk mendapatkan nilai total harga
    public float getTotalPrice(){
        return (price * amount) - (amount * price * discount);
    }
    
    //method yang berfungsi untuk menampilkan (output) dari atribut diatas 
    @Override
    public String toString(){
        return name +" \t\t "+price+" \t\t "+amount+" \t\t "+getTotalPrice()+" \t \t "+(discount*100);
    }
}
