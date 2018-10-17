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
    //atribut
    private float discount;
    
    //membuat konstruktor dari class DiscountItem
    public DiscountItem(String name, float price, int amount,float discount){
        super(name,price,amount);
        this.discount=discount;
    }
    //method menghitung diskon
    public float getDiscount(){
        return (amount*price)*discount;
    }
    //method untuk menghitung harga yang sudah di diskon
    public float getTotalPrice(){
        return amount*price-getDiscount();
    }
    //method untuk menampilkan
    public String toString(){
        return "|"+(name)+"\t\t"+(price)+"\t\t"+(amount)+"\t\t"+getTotalPrice()+"\t|\n|-Discount\t|"+discount*100+"%\t\t|\t\t|\t\t|";
    }
}
