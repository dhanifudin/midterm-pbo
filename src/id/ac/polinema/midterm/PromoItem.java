/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author J I N G G A
 */
public class PromoItem extends Item{
    private float promo;

    public PromoItem( String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    //method yang berfungsi sebagai menghitung total harga setelah mendapatkan promo
    public float getTotalPrice(){
        return (amount * price) - (amount * promo);
    }
    
    //method yang berfungsi sebagai menampilkan output
    @Override
    public String toString(){
        return name +" \t\t "+price+" \t\t "+amount+" \t\t "+getTotalPrice()+" \t \t "+promo;
    }
}
