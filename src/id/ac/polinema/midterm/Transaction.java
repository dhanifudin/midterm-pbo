/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;


public class Transaction {

    private Item item;
    private DiscountItem discountItem;
    private PromoItem promoItem;

    public Transaction(){
    }
    
    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }

	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|" + item.nama + "\t\t|" + item.price + "\t\t|" + item.getTotalPrice());
		System.out.println("|" + discountItem.nama + "\t\t|" + discountItem.price + "\t\t|" + discountItem.DiscountItem());
                System.out.println("|-Disc \t\t|" + discountItem.disc() + "%");
		System.out.println("|" + promoItem.nama + "\t\t|" + promoItem.price + "\t\t|" + promoItem.PromoItem());
                System.out.println("|-Promo \t|" + promoItem.promo());
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
