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
    private Item item; // deklarasi class Item dengan nama variabel item
    private DiscountItem discountItem; //deklarasi class Discountitem dengan nama variabel DiscountItem
    private PromoItem promoItem; //deklarasi class PromoItem dengan nama variabel PromoItem

    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) { //konstuktor class transaction
        this.item = item;  
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
    
    
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.print(item.getNama()+"\t\t");    //melakukan pengambilan nama menggunakan getNama
		System.out.print(item.getPrice()+"\t\t");   //melakukan pengambilan harga menggunakan getPrice
		System.out.print(item.getAmount()+"\t\t");  //melakukan pengambilan jumlah menggunakan getAmount
                System.out.println(item.getTotal());        //melakukan pengambilan jumlah total harga yang telah di hitung menggunakan getTotal
                
                System.out.print(discountItem.nama + "\t\t");   //melakukan pengambilan nama. tidak menggunakan get karena 'nama' sudah berada di class parent sehinggan tidak perlu melakukan setter dan getter
                System.out.print(discountItem.price + "\t\t");  //melakukan pengambilan price. tidak menggunakan get karena 'price' sudah berada di class parent sehinggan tidak perlu melakukan setter dan getter
                System.out.print(discountItem.amount + "\t\t"); ////melakukan pengambilan amount. tidak menggunakan get karena 'amount' sudah berada di class parent sehinggan tidak perlu melakukan setter dan getter
                System.out.println(discountItem.getTotalHargaItemDiskon1());    //perhitungan terhadap totaldiskon
                System.out.println("-Disct\t\t" + discountItem.getDiscount()*100);  //hasil harga barang * jumlah - totaldiskon
                
                System.out.print(promoItem.nama+"\t\t");    //melakukan pengambilan nama. tidak menggunakan get karena 'nama' sudah berada di class parent sehinggan tidak perlu melakukan setter dan getter
                System.out.print(promoItem.price+"\t\t");   //melakukan pengambilan harga. tidak menggunakan get karena 'harga' sudah berada di class parent sehinggan tidak perlu melakukan setter dan getter
                System.out.print(promoItem.amount+"\t\t");  //melakukan pengambilan jumlah. tidak menggunakan get karena 'jumlah' sudah berada di class parent sehinggan tidak perlu melakukan setter dan getter
                System.out.println(promoItem.getTotalPrice());  //mengambil total harga promo
                System.out.println("-Promo\t\t" + promoItem.getPromo());
                
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
