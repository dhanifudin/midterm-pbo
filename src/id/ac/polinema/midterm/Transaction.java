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
    
    //hak akses transaction
    private Item item;
    private DiscountItem discountitem;
    private PromoItem promoItem;
    
   //konstruktor	   
   Transaction(Item item, DiscountItem discountitem, PromoItem promoItem){
        this.item = item;
        this.discountitem = discountitem;
        this.promoItem = promoItem;
    }
    
    //menampilkan hasil-hasil kelas yang dipanggil	   
    public void print() {
	System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
	System.out.println("|---------------------------------------------------------------|");
	System.out.println("|" + item.name + "\t\t|" + item.price + "\t\t|" + item.amount + "\t\t|" + item.getTotalPrice());
	System.out.println("|" + discountitem.name + "\t\t|" + discountitem.price + "\t\t|" + discountitem.amount + "\t\t|" + discountitem.DiscountItem());
	System.out.println("| -Disc \t|" + discountitem.Disc() + "%");
        System.out.println("|" + promoItem.name + "\t\t|" + promoItem.price + "\t\t|" + promoItem.amount + "\t\t|" + promoItem.PromoItem());
        System.out.println("| -Promo + \t|" + promoItem.promo());
	System.out.println("|---------------------------------------------------------------|");
    }
	
}
