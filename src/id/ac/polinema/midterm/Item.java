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
    protected String nama;
    protected float price;
    protected int amount;

    public Item(String nama, float price, int amount) {
        this.nama = nama;
        this.price = price;
        this.amount = amount;
    }

    public float getTotalPrice() {
        return price*amount;
    }

    @Override
    public String toString() {
        return nama;
    }
}
