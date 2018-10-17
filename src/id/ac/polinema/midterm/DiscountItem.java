/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author admj
 */
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String nama, float price, int amount, float discount) {
        super(nama, price, amount);
        this.discount=discount;
    }

    public float getDiscount() {
        return price*discount;
    }
   public float Discount(){
       return price-getDiscount();
   }
   public float total(){
       return amount*Discount();
   }

    @Override
    public String toString() {
        return "Disc "+5.0+"%";
    }
}
