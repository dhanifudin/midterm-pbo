/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author AhmadSyifaur
 */
public class PromoItem extends Item{
    private float promo;

    public PromoItem(String name, float price, int amount,float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    //method ini digunakan untuk mendapatkan total harga akhir setelah mendapat potongan promo
    @Override
    public float getTotalPrice(){
        return (this.amount*this.price)-(this.promo*this.amount);
    }
    //method ini digunakan untuk menampilkan item
    @Override
    public String toString(){
        String print="";
        print+= "|"+this.name+"\t\t"+"|"+this.price+"\t"+"|"+this.amount+"\t\t"+"|"+this.getTotalPrice()+"\t|";
        print+= "\n|-promo"+"\t\t"+"|"+this.promo+"\t\t|\t\t|\t\t|";
        return print;
    }
    
}
