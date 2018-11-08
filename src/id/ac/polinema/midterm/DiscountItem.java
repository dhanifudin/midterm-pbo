/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Irham Rizady
 */
public class DiscountItem extends Item{
    
    //Atribut tambahan dari extends Class Item
    private float discount;
    
    //Membuat Konstruktor berparameter untuk Class DiscountItem
    public DiscountItem(String name, float price, int amount, float discount){
        super(name, price, amount);
        this.discount = discount;
    }
   
    //Method untuk menghitung diskon
    public float getDiscount(){
        return (amount*price)*discount;
    }
    
    //Method yang digunakan untuk menghitung harga yang sudah di diskon
    @Override
    public float getTotalPrice(){
        return amount*price - getDiscount();
    }
    
    //Method untuk menampilkan
    @Override
    public String toString(){
        return "|"+(name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+getTotalPrice()+"\t|\n|-Discount\t|"+discount*100+"%\t\t|\t\t|\t\t|";
    }
}