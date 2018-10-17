/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Ismir
 */
public class DiscountItem extends Item {
    //menambahkan atribut
    private float discount;
    
    //menambahkan konstruktor
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }
    //method untuk menghitung harga yang memiliki diskon
    public float getTotalPrice(){
        return price * amount - getDiscount();
    }
    
    //method untuk menampilkan
    public String toString(){
        return "|"+(name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+getTotalPrice()+"\t|\n|-Discount\t|"+discount*100+"%\t\t|\t\t|\t\t|";
    }
}
