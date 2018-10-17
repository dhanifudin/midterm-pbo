/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Rivo
 */
public class DiscountItem extends Item{
    private float discount;
    
    public DiscountItem(String name, float price, int amount, float discount){
        super(name, price, amount);
        this.discount = discount;
    }
    //membuat constructornya menggunakan super
    
    public float getDiscount(){
        return(amount*price)*discount;
    }
    //menghitung diskonnya
    
    public float getTotalPrice(){
        return amount*price-getDiscount();
    }
    //menghitung jumlahnya
    
    public String toString(){
        return "|"+name+"\t\t"+"|"+price+"\t"+"|"+amount+"\t\t"+"|"+getTotalPrice()+"\t|"+"\n|-Disc"+"\t\t"+"|"+discount*100+"%\t\t|\t\t|\t\t";
    }
    //untuk menampilkan dengan tatanan seperti diatas
}
