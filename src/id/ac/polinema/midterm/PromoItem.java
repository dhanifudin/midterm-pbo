/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author khosy
 */
public class PromoItem extends Item{
    private float promo;

    //Kontruktor ini saya buat sama dengan yang ada di class Main agar tidak error
    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }

    //method ini berguna untuk menghitung total harga dengan mamasukan atribut promo
    @Override
    public float getTotalPrice(){
        return (this.amount*this.price)-(this.promo*this.amount);
    }
    
    //method ini beguna untuk memberikan informasi tentang promo yang telah di buat.
    @Override
    public String toString(){
        return "|"+(this.name)+"\t\t|"+(this.price)+"\t|"+(this.amount)+"\t\t"+getTotalPrice()+"\t|"+"\n|-Promo"+"\t\t|"+this.promo+"\t\t\t";
    }
    
    
    
    
    
}
