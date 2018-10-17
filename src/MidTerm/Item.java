package MidTerm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class Item {
    /*
    protected yaitu kode yang hanya dapat diakses oleh class item dan extends
    */
    protected String name;
    protected float price;
    protected int amount;
    /*
    konstruktor dari class item
    */
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    /*
    didalam method getTotalPrice() menampilkan harga dikali jumlah
    */
    public float getTotalPrice(){
        return price*amount;
    }   
    
    /*
    method toString sama seperti method cetak
    */
    public String toString(){
       return "|"+name+"\t|"+price+"\t\t|"+amount+"\t\t|"+getTotalPrice()+" \t|";
    }
}
