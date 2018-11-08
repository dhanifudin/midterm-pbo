/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author WINDOWS 10
 */
public class DiscountItem extends Item{
    private float discount;

    //membuat konstruktor berparameter dari class DiscountItem
    public DiscountItem(String name, int price, float amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    //membuat method untuk menghitung total setelah mendapat diskon
    @Override
    public float getTotalPrice(){
        return (price*amount) - (price*amount*discount);
    }
    
    //membuat method untuk menampilkan 
    @Override
    public String toString(){
        return "|"+(name)+" \t\t|"+(price)+"\t\t|"+(amount)+"\t\t|"+(price*amount)+"\t\t|"+getTotalPrice()+"\t|"+"\n"+"|"+"-Disc"+"\t\t"+(discount*100)+"%"+"\t\t|"+"\t\t|"+"\t\t|";
    }
}
