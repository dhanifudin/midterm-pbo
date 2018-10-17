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
public class PromoItem extends Item{
    float promo;

    public PromoItem(String nama, float price, int amount, float promo){
        super(nama, price, amount);
        this.promo = promo;
    } 
    public String Getnama(){
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

    public float getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }

    public float PromoItem(){
        return (price*amount) - (promo*amount);
    }
    
    public float promo(){
        return promo;
    }
}
