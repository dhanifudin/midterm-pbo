package id.ac.polinema.midterm;

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
    protected String name;
    protected float price;
    protected int amount;
//    Protected adalah kode akses yang membuat suatu data atau method
//    yang didefinisikan dengan tingkatan akses ini dapat diakses oleh kelas yang memilikinya saja
//    dan juga kelas-kelas yang masih memiliki keturunan atau Encapsulation data

    public Item() {
    }

    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
   
    public float getTotalPrice(){
        return getPrice()*getAmount();
    }
    
    @Override
    public String toString(){
        return "| " + getName() + " \t\t| " + getPrice() + " \t| " + getAmount() + " \t\t| " + getTotalPrice() + " \t|";
    }
//    Method ini digunakan untuk mendapatkan objek String yang mewakili nilai dari Nomor Object.
}