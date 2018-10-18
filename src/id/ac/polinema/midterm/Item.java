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
      //menambahkan atribut bertipe string
    protected String name;
      //menambahkan atribut bertipe float
    protected float price;
      //menambahkan atribut bertipe int
    protected int amount;
      
      //menambahkan kontruktor
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
      
      //menghitung total
    public float getTotalPrice() {
        return price * amount;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
