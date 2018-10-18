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
    // membuat atribut dengan acess modifier private
    // karena privat hanya bisa diakses di kelass ini saja
    private Item item;
    private DiscountItem discountItem;
    private PromoItem promoItem;

    public Transaction(){
        
    }
    // membuat constructor
    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
    
    
    // mengedit method print agar bisa menampilkan sesuai yang ada pada soal
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
                // disini yang awalnya item saja diganti dengan item.yang ingin dipanggil
                // karena ketika yanh dipanggil hanya item saja akan keluar yang "nama saja"
                // jadi harus menambah kah dot yang ingin dipanggil untuk memanggil harga, jumlah, total
		System.out.println("|" + item.name + "\t\t|" + item.price + "\t|" + item.amount + "\t\t|" + item.getTotalPrice() + "\t|");
		System.out.println("|" + discountItem.name + "\t\t|" + discountItem.price + "\t|" + discountItem.amount + "\t\t|" + discountItem.setDiscountTotal() + "\t|");
                System.out.println("|-Disc\t\t|" + discountItem.setDiscount() +" % \t\t|\t\t|\t\t|");
		System.out.println("|" + promoItem.name + "\t\t|" + promoItem.price + "\t|" + promoItem.amount + "\t\t|" + promoItem.setPromoTotal() + "\t|");
                System.out.println("|-Promo\t\t|" + promoItem.promo +" \t|\t\t|\t\t|");
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
