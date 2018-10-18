/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Ojan
 */
public class PromoItem extends Item {
    private float promo;
    
    //Constructor untuk PromoItem
    
    public PromoItem(String name, float price, int amount, float promo){
        super(name,price,amount);
        this.promo = promo;
    }
    
    //Berfungsi untuk mendapatkan harga promo ketika harga jumlah di kurangi dengan promo per item 
    public float getPromoItem(){
        return getTotalPrice() -  promo*amount;
    }
    
    //Berfungsi untuk menambahkan harga promo
    public void setPromo(float promo){
        this.promo = promo;
    }
    
    //Berfungsi untuk mengeluarkan harga promo
    public float getPromo (){
        return promo;
    }
    
    public String toString(){
        tostring = "| "+this.name+"\t\t| "+this.price+"\t| "+this.amount+"\t\t| "+getPromoItem()+"\t|\n";
        tostring += "| -Promo"+"\t| "+this.promo+"\t| "+""+"\t\t| "+"\t\t|";
        return tostring;
    }
}
