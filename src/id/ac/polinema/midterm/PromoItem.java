/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Ojan
 */
public class PromoItem extends Item {
    private float promo;
    
    public PromoItem(String name, float price, int amount, float promo){
        super(name,price,amount);
        this.promo = promo;
    }
    
    public float getPromoItem(){
        return getTotalPrice() -  promo*amount;
    }
    
    public void setPromo(float promo){
        this.promo = promo;
    }
    
    public float getPromo (){
        return promo;
    }
    
    public String toString(){
        tostring = "| "+this.name+"\t\t| "+this.price+"\t| "+this.amount+"\t\t| "+getPromoItem()+"\t|\n";
        tostring += "| -Promo"+"\t| "+this.promo+"\t| "+""+"\t\t| "+"\t\t|";
        return tostring;
    }
}
