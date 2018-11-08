/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author WINDOWS 10
 */
public class PromoItem extends Item{
    private float promo;
    
    //membuat konstruktor berparameter dari class PromoItem
    public PromoItem(String name, int price, float amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    //membuat method untuk menghitung total setelah mendapatkan promo
    @Override
    public float getTotalPrice(){
        return (price*amount) - (amount*promo);
    }
    
    //membuat method untuk menampilkan
    @Override
    public String toString(){
        return "|"+(name)+"\t\t|"+(price)+"\t\t|"+(amount)+"\t\t|"+getTotalPrice()+"\t|"+"\n"+"|"+"-Promo"+"\t\t"+(promo)+"\t\t|"+"\t\t|"+"\t\t|";
    }
}
