/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author admj
 */
public class PromoItem extends Item{
    //menambahkan atribut promo bertipe float
    private float promo;
    //menambahkan konstruktor
    public PromoItem(String nama, float price, int amount, float promo) {
        super(nama, price, amount);
        this.promo= promo;
    }
    //fungsi getPromo berguna untuk menghitung promo dengan mengurangi price dengan promo
    public float getPromo() {
        return price-promo;
    }
    //fungsi total berguna untuk mendapatkan total harga yang sudah mendapat promo
    public float total(){
        //mengalikan amount dengan getPromo
        return amount*getPromo();
    }
    //mengubah nilai dari class parrent
    @Override
    public String toString() {
        return "-Promo "+promo;
    }
}
