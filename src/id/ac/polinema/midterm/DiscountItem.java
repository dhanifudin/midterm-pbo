/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author ALDO
 */
//tambahkan ekstends karna DiscountItem anak dari Item//
public class DiscountItem extends Item{
    private float discount;
    
//Construktor untuk mengambil nilai yang di inputkan//
    public DiscountItem(String name, float price, int amount,float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    //getter untuk mendapatkan Total harga susu//
    public float getTotalHargasusu(){
    return (price*amount)-(price*amount*discount);
    }
//untuk mendapatkan nilai discount//
    public float getDiscount() {
        return discount;
    }
   
    
    
}
