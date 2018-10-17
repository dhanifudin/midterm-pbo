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

private Item Item;
private PromoItem promoItem;
private DiscountItem discountItem;
   

    public Transaction(Item Item, DiscountItem discountItem, PromoItem promoItem) {
        this.Item = Item;
        this.promoItem = promoItem;
        this.discountItem = discountItem;
        }

    public Item getItem() {
        return Item;
    }

    public void setItem(Item Item) {
        this.Item = Item;
    }

    public PromoItem getPromoItem() {
        return promoItem;
    }

    public void setPromoItem(PromoItem promoItem) {
        this.promoItem = promoItem;
    }

    public DiscountItem getDiscountItem() {
        return discountItem;
    }

    public void setDiscountItem(DiscountItem discountItem) {
        this.discountItem = discountItem;
    }

	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|" + Item.nama + "\t\t|" + Item.price + "\t|" + Item.amount + "\t\t|" + Item.getTotalPrice());
		System.out.println("|" + discountItem.nama + "\t\t|" + discountItem.price + "\t|" + discountItem.amount + "\t\t|" + discountItem.diskon());
                System.out.println("|-Disc \t\t|" + discountItem.diskonItem()+"%" +"\t\t|" + "\t\t|");
		System.out.println("|" + promoItem.nama + "\t\t|" + promoItem.price + "\t|" + promoItem.amount + "\t\t|" + promoItem.PromoItem());
                System.out.println("|-Promo \t|" + promoItem.promo() + "\t\t|" + "\t\t|");
		System.out.println("|---------------------------------------------------------------|");
	}

}
