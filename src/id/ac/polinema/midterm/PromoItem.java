/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author sin
 */
class PromoItem extends Item{
    private float promo;

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo=promo;
    }
    
    //menghitung total yang dibeli lalu dikurangi promo
    public float getPromo(){
        return (amount*price)-(promo*amount);
    }
    
    //menampilkan hasil promo
     public String toString(){
         return "|"+(name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+getPromo()+"\t|\n|-Promo\t\t|"+promo+"\t\t|\t\t|\t\t|";
    }

}
 