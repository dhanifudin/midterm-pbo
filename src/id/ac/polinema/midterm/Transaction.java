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
        private DiscountItem discountItem;
        private PromoItem promoItem;

    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
    
        
        
    
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|" + item.name + "\t\t|" + item.price + "\t|" + item.amount +"\t\t|" + item.getTotalPrice() +"\t|");
		System.out.println("|" + discountItem.name + "\t\t|" + discountItem.price + "\t|" + discountItem.amount + "\t\t|" + discountItem.setDiskon()+"\t");
                System.out.println("|" + "-Disc \t\t|"  + discountItem.getDiskon()+"%");
		System.out.println("|" + promoItem.name + "\t\t|" + promoItem.price + "\t|" + promoItem.amount +"\t\t|" + promoItem.setPromo());
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
