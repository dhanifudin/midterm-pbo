package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class DiscountItem extends Item{
    private float discount;
    
    public DiscountItem(String name, float price, int amount, float discount){
        super(name, price, amount);
        this.discount=discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    @Override
    public float getTotalPrice(){
        return (this.price*this.amount)-((this.price*this.amount)*getDiscount());
    }
    
    @Override
    public String toString() {
        return "| "+name+"\t\t| "+price+"\t|"+amount+"\t\t|"+this.getTotalPrice()+"\t|\n"+"| -Disc\t\t| "+(getDiscount()*100)+"%\t\t|\t\t|\t\t|";
    }
}
