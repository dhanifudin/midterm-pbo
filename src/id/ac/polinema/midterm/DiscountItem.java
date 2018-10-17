/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Dhandy
 */
public class DiscountItem extends Item{
     private float discount;

   
    public DiscountItem(String name,float price,int amount, float discount) {
        super(name,price,amount);
        this.discount = discount*100;
         
    }

    public float getDiscount() {
        return discount;
    }
    public float total(){
        float total=(this.amount*this.price);
        return total;
    }
    
    public float getTotalDiscount(){
        float discount;
        discount=(this.discount/100)*total();
        return discount;
    }
    
    public float getTotal(){
        float total;
        total=total()-getTotalDiscount();
        return total;
    }
    public String toString(){
        String print="";
        print += "|"+this.name+"\t\t|"+this.price+"\t|"+this.amount+"\t\t"+getTotal()+"\t\t|\n|-Disc\t\t|";
        print += this.discount;
        return print;
    }
}
