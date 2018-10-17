/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author haliz
 */
public class discountItem extends Item {
    private float discount;
    
    public discountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount * 100;
    }
    
    public float getDiscount() {
        float diskon = (this.discount / 100) * super.getTotal();
        return diskon;
    }
    
    @Override
    public float getTotal() {
        return super.getTotal() - getDiscount();
    }
    
    public String toString() {
        String tostring = "";
        tostring += "| "+this.name+" \t\t| "+this.price+" \t| "+this.amount+" \t\t| "+ this.getTotal() +"\t|\n";
        tostring += "| -Discount\t| "+this.discount+"%\t\t|\t\t|\t\t|";
        return tostring;
    }
}
