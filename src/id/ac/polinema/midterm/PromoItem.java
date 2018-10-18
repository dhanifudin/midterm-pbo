/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Karinawdyi
 */
public class PromoItem extends Item{
    //menambahkan atribut promo
    private float promo;
    
    //menambahkan konstruktor berparameter 
    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    //menambahkan method untuk menghitung Harga Total dengan menggunakan promo
    public float getTotalPrice(){
        return (price*amount) - (amount*promo);
    }
    
    //menambahkan method untuk @Override
    @Override
    public String toString(){
        return "|" + (name) + "\t\t" + (price) + "\t\t|" +(amount) +"\t\t|" + getTotalPrice() + "\t|" + "\n"+"|"+"-Promo"+"\t\t"+(promo)+"\t\t|"+"\t\t|"+"\t\t|";
    }
}
