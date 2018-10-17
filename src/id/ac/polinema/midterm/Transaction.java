/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author dhanifudin
 */
public class Transaction {
    //Private adalah kode yang sesuai dengan namanya, akses ini bersifat private. 
    //Dengan kata lain data maupun method hanya dapat diakses oleh kelas yang dimilikinya saja.
    private Item item;
    private DiscountItem discountItem;
    private PromoItem promoItem;

    //konstruktor dari class Transaction
    Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setDiscountItem(DiscountItem discountItem) {
        this.discountItem = discountItem;
    }

    public void setPromoItem(PromoItem promoItem) {
        this.promoItem = promoItem;
    }

    //method untuk menampilakan outputnya
    public void print() {
	System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
	System.out.println("|---------------------------------------------------------------|");
	System.out.println(item);
	System.out.println(discountItem);
	System.out.println(promoItem);
	System.out.println("|---------------------------------------------------------------|");
    }
}