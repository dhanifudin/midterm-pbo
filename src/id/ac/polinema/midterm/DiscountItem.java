/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author AhmadSyifaur
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String name, float price, int amount,float discount) {
        super(name, price, amount);
        this.discount = discount*100;
    }
    //method ini digunakan untuk mendapatkan dicount dari transaksi
    public float getDiscount() {
        return (this.amount*this.price)*this.discount/100;
    }
    
    //method ini digunakan untuk mendapatkan total harga akhir dari item setelah di discount
    @Override
    public float getTotalPrice(){
        return this.amount*this.price-this.getDiscount();
    }
    
    //method ini digunakan untuk menampilkan item
    @Override
    public String toString(){
        String print="";
        print +="|"+this.name+"\t\t"+"|"+this.price+"\t"+"|"+this.amount+"\t\t"+"|"+this.getTotalPrice()+"\t|";
        print += "\n|-Disc"+"\t\t"+"|"+this.discount+"%\t\t|\t\t|\t\t|";
        return print;
    }
}
