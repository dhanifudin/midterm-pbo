/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author MSI Notebook
 */
public class DiscountItem extends Item {
    
    private float discount ;
    
    
    
    
    //
    public DiscountItem(String name, float price, int amount , float discount) {
        super(name, price, amount);
        this.discount = discount * 100 ;
    }
    
    
    
    // disini untuk menghitung diskon pada harga susu
    public float getDiscount() {
        return (amount * price) * discount / 100 ;
    }
    
    
    // disini untuk menghitung harga yang sudah didiskon untuk susu
    public float getTotalPrice() {
        return price * amount - getDiscount() ;
    }
    
    
    // untuk menampilkan info cetak / output
    public String toString() {
        return "|" + name +"\t\t"+"|" + price + "\t"+"|" + amount + "\t\t"+"|" +getTotalPrice() + "\t|"+"\n| - Disc"+"\t\t"+"|" + discount+"%\t\t|\t" ;
    }
    
    
}
