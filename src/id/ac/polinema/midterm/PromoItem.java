/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Mery Kris
 */
public class PromoItem extends Item {
    //Private adalah kode yang sesuai dengan namanya, akses ini bersifat private. 
    //Dengan kata lain data maupun method hanya dapat diakses oleh kelas yang dimilikinya saja.
    private float promo;

    //konstruktor dari class PromoItem
    public PromoItem( String name, float price, int amount,float promo) {
        super(name, price, amount);
        this.promo = promo;
    }

    //untuk menghitung promo
    public float getPromo() {
        return amount * promo;
    }
        
    //untuk menghitung total yang sudah mendapatkan promo
    public float getTotal() {
        return getTotalPrice() - getPromo();
    }
    
    //method ini untuk menampilkan output
    @Override
    public String toString(){
        return "| " + getName() + " \t\t| " + getPrice() + " \t| " + getAmount() + " \t\t| " + getTotal() + " \t|"
                + "\n|-Promo\t" + promo+"\t\t\t|\t\t|\t\t|";
    }
}
