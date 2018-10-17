/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author sin
 */
class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount=discount*100;
    }

    //menghitung diskon
    public float getDiscount() {
        return (amount*price)*discount/100;
    }
    
    //menghitung total yang dibeli lalu dikurangi diskon
    public float getTotalDiscount(){
        return price*amount-getDiscount();
    }
    
    //menampilkan hasil diskon
   public String toString(){
        return "|"+(name)+"\t\t|"+(price)+"\t|"+(amount)+"\t\t|"+getTotalDiscount()+"\t|\n|-Disc\t\t|"+discount+"%\t\t|\t\t|\t\t|";
    }


    
    
}
