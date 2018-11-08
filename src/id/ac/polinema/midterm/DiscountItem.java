/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author falcao
 */
public class DiscountItem extends Item{
    //untuk memasukan diskon
    public float discount;
    
    
    //konstruktor
    DiscountItem(){
    
    }
    
    //konstruktor
    public DiscountItem(String name, float price, int amount, float discount){
        super(name, price, amount);
        this.discount = discount;
    }
    
    //setter dan getter
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    //untuk menghitung discount barang
    public float DiscountItem(){
        return (price*amount) - (price*amount*discount);
    }
    
    //atribut
    public float Disc(){
        return discount * 100;
    }
    
}
