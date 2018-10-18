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
        private Item item; // Membuat atribut item dengan tipe data Item yang di ambil dari class Item
        private DiscountItem discountItem; // Membuat atribut discountItem yang di ambil dari class DiscountItem
        private PromoItem promoItem; // Membuat atribut promoItem yang di ambil dari class PromoItem

    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
    // Mengambil nilai dari ketiga class melalui atribut item, discountItem, promoItem
    
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println(item);
		System.out.println(discountItem);
		System.out.println(promoItem);
		System.out.println("|---------------------------------------------------------------|");
	}
	// Menampilkan hasil dari atribut item, discountItem, promoItem
}
