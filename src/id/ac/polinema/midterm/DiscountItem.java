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
public class DiscountItem extends Item{
    private float discount;
    
    public DiscountItem(String name, float price, int amount, float discount){
        super(name,price,amount);
        this.discount = discount;
    }
    
    public float hargaDiskon(){
        return getTotalPrice() - (float)(getTotalPrice()*discount);
    }
    
    public void setDiscount(float discount){
        this.discount = discount;
    }
    
    public float getDiscount (){
        return discount;
    }
    
    @Override
    public String toString(){
        tostring = "| "+this.name+"\t\t| "+this.price+"\t| "+this.amount+"\t\t| "+hargaDiskon()+"\t|\n";
        tostring += "| -Disc"+"\t\t| "+this.discount*100+"%\t\t| "+""+"\t\t| "+"\t\t|";
        return tostring;
    }
}
