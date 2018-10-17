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
        super(name,price,amount);   //Untuk mengisi constructor yang ada di class parent
        this.discount = discount;   //Untuk mengisi data ke variable discount
    }
    
    public float hargaDiskon(){
        return getTotalPrice() - (float)(getTotalPrice()*discount); //method untuk menghitung harga diskon
    }
    
    public void setDiscount(float discount){
        this.discount = discount; //Untuk mengeset nilai atau memasukkan nilai ke variable discount
    }
    
    public float getDiscount (){
        return discount; //Untuk mengembalikan nilai dari variable discount
    }
    
    @Override
    public String toString(){
        tostring = "| "+this.name+"\t\t| "+this.price+"\t| "+this.amount+"\t\t| "+hargaDiskon()+"\t|\n"; //Fungsinya untuk menambahkan hasil/menampilkan hasil yang di simpan di dalam variable tosrting
        tostring += "| -Disc"+"\t\t| "+this.discount*100+"%\t\t| "+""+"\t\t| "+"\t\t|";//Fungsi ini menambah nilai ke tostring
        return tostring;
    }
}
