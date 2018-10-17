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
		System.out.print(item.getNama()+"\t\t");
		System.out.print(item.getPrice()+"\t\t");
		System.out.print(item.getAmount()+"\t\t");
                System.out.println(item.getTotal());
                System.out.print(discountItem.nama + "\t\t");
                System.out.print(discountItem.price + "\t\t");
                System.out.print(discountItem.amount + "\t\t");
                System.out.println(discountItem.getTotalHargaItemDiskon1());
                System.out.println("-Disct\t\t" + discountItem.getDiscount()*100);
                System.out.print(promoItem.nama+"\t\t");
                System.out.print(promoItem.price+"\t\t");
                System.out.print(promoItem.amount+"\t\t");
                System.out.println(promoItem.getTotalPrice());
                System.out.println("-Promo\t\t" + promoItem.getPromo());
                
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
