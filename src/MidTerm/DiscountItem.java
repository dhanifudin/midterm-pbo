/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidTerm;

/**
 *
 * @author Arifanny Ramadhan Sukma / 1741720217 / TI=2A
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    /*
    method getDiscount()yaitu menampilkan harga dikali jumlah lalu dikali diskon
    */
    public float getDiscount(){
        return (amount*price)*discount;
    }
    
    public float getTotalPrice(){
        return amount*price-getDiscount();
    }
    
    public String toString(){
       return "|"+name+"\t|"+price+"\t\t|"+amount+"\t\t|"+getTotalPrice()+" \t|";
    }
}
