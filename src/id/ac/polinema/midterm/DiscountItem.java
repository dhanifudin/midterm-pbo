/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author HP
 */
public class DiscountItem extends Item{
    //menambahkan atribut
    private float discount;
    
    //constructor untuk class DiscountItem
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    //method untuk menghitung discount
    public float getDiscount(){
        return (amount * price) * discount;
    }
    
    //method untuk menghitung hargta total yang sudah di discount
    public float getTotalPrice(){
        return (price * amount) - getDiscount();
    }
    
    //untuk menampilkan
    @Override
    public String toString(){
        return "|"+name+"\t\t|"+price+"\t|"+amount+"\t\t"+getTotalPrice()+"\t|\n|-disc\t|"+discount*100+"%\t\t|\t\t|\t\t";
    }
}
