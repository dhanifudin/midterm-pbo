/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author haliz
 */
public class promoItem extends Item {
    private float promo;
    
    //Konstruktor class promo item
    public promoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    @Override
    //Method override dari class item
    public float getTotal() { 
        return super.getTotal() - this.promo;
    }
    
    //Method untuk menampilkan isi class promoItem
    public String toString() {
        String tostring = "";
        tostring += "| "+this.name+" \t\t| "+this.price+" \t| "+this.amount+" \t\t| "+ this.getTotal() +"\t|\n";
        tostring += "| -Promo\t| "+this.promo+"\t|\t\t|\t\t|";
        return tostring;
    }
}
