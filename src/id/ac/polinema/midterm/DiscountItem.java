/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author KINTUL
 */
class DiscountItem extends Item{
    // membuat atribut dengan acess modifier protected agar bisa diakses di 
    // class yang memilikinya 
    // ketika saya menggunakan private akan eror pada method print pada class Transaction
    protected float discount;

    public DiscountItem(){
        
    }
    // membuat constructor
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    // membuat method untuk menghitung diskon
    // yang didapat dari total harga dikurangi diskon yang didapat yaitu price dikali jumlah barang dikalikan diskon 
    public float setDiscountTotal(){
        return price * amount - (price * amount * discount);
    }
    // membuat method untuk menampilkan diskon dalam bentuk satua persen
    // agar tidak bingung ketika membaca 0.05 itu berapa persen
    // dan dipanggil di method print pada class Transaction untuk menampilkan hasil yang diinginkan
    public float setDiscount(){
        return discount * 100;
    }
    
}
