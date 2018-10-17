/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Yulica
 */
public class DiscountItem extends Item{
    private float discount;
    
    //tambahkan constructor
    public DiscountItem(String nama, float price, int amount, float discount) {
        super(nama, price, amount);
        this.discount = discount;
    }
    
    //menambahkan method total harga
    public float getTotalPrice(){

       return totalprice; 
    }
    
    //menambahkan method untuk menampilkan isi
    public String toString(){

    }
    
    
    
    
    
}
