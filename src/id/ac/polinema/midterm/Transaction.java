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

        private Item item;                  //Inisialisasi atribut -->
        private discountItem discountItem;
        private promoItem promoItem;        //                     -->
        
        //Konstruktor class Transaction
        public Transaction(Item item, discountItem discountItem, promoItem promItem) {
            this.item = item;
            this.discountItem = discountItem;
            this.promoItem = promItem;
        }
        
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println(item);
		System.out.println(discountItem);
		System.out.println(promoItem);
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
