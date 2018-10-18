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
    
    private Item item;
    private DiscountItem discountitem;
    private PromoItem promoitem;
    
    //constructor untuk class Transaction
    public Transaction(Item item, DiscountItem discountitem , PromoItem promoitem) {
        this.item = item;
        this.discountitem = discountitem;
        this.promoitem = promoitem;
    }
    
        //method untuk menampilkan
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println(item);
		System.out.println(discountitem);
		System.out.println(promoitem);
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
