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
    
    private Item item; //atribut item yang mengambil class item sebagai tipe data
    private DiscountItem discountItem;// atribut discountitem yg mengambil class DiscounItem sebagai tipe data  
    private PromoItem promoItem; //atribut promoitem yg mengambil class promoItem sebagai tipe data 

    public Transaction() { //constraktor Transaction
    }

    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) { //parameter Transaction
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
    
    
    
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|" + item.nama + "\t\t|" + item.price + "\t|" + item.amount + "\t\t|" + item.getTotalPrice() + "\t|");
		System.out.println("|" + discountItem.nama + "\t\t|" + discountItem.price + "\t|" + discountItem.amount + "\t\t|" + discountItem.getTotalPrice() + "\t|");
		System.out.println("|-disc\t\t|" + discountItem.getDiscount() + "%\t\t|\t\t|\t\t|");
                System.out.println("|" + promoItem.nama + "\t\t|" + promoItem.price + "\t|" + promoItem.amount + "\t\t|" + promoItem.getTotalPrice() + "\t|");
		System.out.println("|-promo\t\t|" + promoItem.promo + "\t\t|\t\t|\t\t|");
                System.out.println("|---------------------------------------------------------------|");
	}
	
}
