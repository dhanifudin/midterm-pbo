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
public class PromoItem extends Item{
    
    //untuk memasukan promo
    public float promo;
    
    //kostruktor
    PromoItem (String name, float price, int amount, float promo) {
        this.name = name;
        this.promo = promo;
        this.price = price;
        this.amount = amount;
    }
    
    //getter dan setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    //menghitung harga promo barang
    public float PromoItem(){
        return price*amount - (promo*amount);
    }
    
    //method promo
    public float promo(){
        return promo;
    }
}
