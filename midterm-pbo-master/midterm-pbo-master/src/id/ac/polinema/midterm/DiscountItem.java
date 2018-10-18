/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.polinema.midterm;

/**
 *
 * @author Expression daffa is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class DiscountItem extends Item { //exteds digunkan untuk menurunkan dari class parent ke class child
    private float discount;
    
    public DiscountItem(String nama,float price, int amount, float discount) {
        super(nama, price, amount); //"super di gunakan untuk memanggil variabel yang berada di class parent
        this.discount = discount;
    }

    public float getTotalHargaItemDiskon1(){
        return (price * amount)-(price *amount*discount); 
    }
    public float getDiscount(){
        return discount;
    }
    
    
    
}
