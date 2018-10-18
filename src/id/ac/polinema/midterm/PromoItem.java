/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author KINTUL
 */
class PromoItem extends Item{
    // menambahkan atribut dengan acess modifier protected agar bisa diakses oleh class yang memilikinya ataupun
    // class yang merupakan keturunannya
    protected float promo;
    
    public PromoItem(){
        
    }
    // menambahkan konstruktor
    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    // menambahkan method setPromoTotal
    // untuk menghitung promo
    // yang didapat dari harga dikurang promo yang didapat
    // baru dikali dengan jumlah barang
    public float setPromoTotal(){
        return (price - promo) * amount;
    }
    
    
}
