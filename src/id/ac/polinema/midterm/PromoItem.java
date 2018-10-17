/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author NurcahyaNaniaA
 */
public class PromoItem extends Item{
    private float promo;

    //konstruktor untuk class PromoItem
    public PromoItem(String name, float price, int amount,float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    //method untuk menghitung total setelah mendapat promo
    public float getTotalPrice(){
        return (amount*price)-(promo*amount);
    }
    
    //method untuk menampilkan 
    public String toString(){
        return "|"+(name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+getTotalPrice()+"\t\n|-Promo\t\t|"+promo+"\t\t|\t\t|";
    }
}
