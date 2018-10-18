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
	//menambahkan atribut data item
	private Item item;
	//menambahkan atribut data promoitem
        private PromoItem promoItem;
	//menambahkan atribut data discountitem
        private DiscountItem discountItem;
	
	//menambahkan atribut constructor
    public Transaction(Item item,  DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.promoItem = promoItem;
        this.discountItem = discountItem;
    }
        
        
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|"+item.name +"\t\t|"+item.price+"\t|"+item.amount+"\t\t|"+item.getTotalPrice()+"\t|");
		System.out.println("|"+discountItem.name+"\t\t|"+discountItem.price+"\t|"+discountItem.amount+"\t\t|"+discountItem.getTotalPrice()+"\t|");
                System.err.println("|-Disc \t\t|" +discountItem.disc()+"%");
		System.out.println("|"+promoItem.name+"\t\t|"+promoItem.price+"\t|"+promoItem.amount+"\t\t|"+promoItem.getTotalPrice()+"\t|");
                System.err.println("|-Promo \t|"+ promoItem.promo());
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
