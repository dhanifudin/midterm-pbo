/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Karinawdyi
 */
public class DiscountItem extends Item {
    //membuat atribut discount
    private float discount;
    
    //menambahkan method konstruktor berparameter
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    //menambahkan method untuk menghitung HargaTotal dengan diskon
    public float getTotalPrice(){
        return(price*amount) - (price*amount*discount);
    }
    //menambahkan method untuk @Override
    @Override
    public String toString(){
        return "|" + (name) + "\t\t" + (price) + "\t\t|" + (amount) + "\t\t|" + getTotalPrice() + "\t" + "\n" +"|"+"-Disc"+"\t\t|"+(discount*100)+"%"+"\t\t|"+"\t\t|"+"\t\t|";
    }
    
    
    
}
