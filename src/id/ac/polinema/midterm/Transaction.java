/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

public class Transaction extends Item{
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
                System.out.print(item.getName()+"\t\t");
                System.out.print(item.getPrice()+"\t\t");
                System.out.print(item.getAmount()+"\t\t");
                System.out.println(item.getTotalPrice());
		System.out.print(discountItem.name+"\t\t");
                System.out.print(discountItem.price+"\t\t");
                System.out.print(discountItem.amount+"\t\t");
                System.out.println(discountItem.getTotalHargasusu());
		System.out.print(promoItem.name+"\t\t");
                System.out.print(promoItem.price+"\t\t");
                System.out.print(promoItem.amount+"\t\t");
                System.out.println(promoItem.getTotalPromo());
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
