/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author YESSYNP
 */
public class DiscountItem extends Item {
    private float discount;
    
    public DiscountItem(String nama, float price, int amount, float discount){
    super (nama, price, amount);
    this.discount= discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
    
    public float diskon(){
        return  (price*amount) -(price * amount * discount);
    }
    
    public float diskonItem(){
        return discount * 100;
    }
    
}