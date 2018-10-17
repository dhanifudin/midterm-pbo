/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author NurcahyaNaniaA
 */
public class DiscountItem extends Item{
    private float discount;
    
    //membuat konstruktor dari kelas discount item
    public DiscountItem(String name, float price, int amount,float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    //method untuk menghitung diskon
    public float getDiscount(){
        return (amount*price)*discount;
    }
    
    //method untuk menghitung harga yang sudah didiskon
    public float getTotalPrice(){
        return amount*price-getDiscount();
    }
    
    //method untuk mengeprint
    public String toString(){
        return "|"+(name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+getTotalPrice()+"\t|\n|-Discount\t|"+discount*100+"\t\t|\t\t|\t\t|";
    }
}
