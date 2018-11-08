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
    //menambahkan atribut pada Transaction yang berasal dari beberapa class sebelumnya
        private Item item;
        private DiscountItem discountItem;
        private PromoItem promoItem;
    
    //menambahkan method konstruktor berparameter
    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
        
        //menambahkan method untuk menampilkan isi dari class ini
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println(item);
		System.out.println(discountItem);
		System.out.println(promoItem);
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
