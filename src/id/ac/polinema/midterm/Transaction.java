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
    //atribute
    private Item item;
    private DiscountItem discountItem;
    private PromoItem promoItem;
    //konstruktor untuk class Transaction
    public Transaction(Item item,DiscountItem discountItem,PromoItem promoItem){
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
        //method untuk menampilkan
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println(item);
		System.out.println(discountItem);
		System.out.println(promoItem);
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
