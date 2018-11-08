/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Ahmad Musyadad A
 */
public class DiscountItem extends Item{
    private float discount;
//    Private adalah kode yang sesuai dengan namanya, akses ini bersifat private. dengan kata lain data maupun method hanya dapat diakses
//    oleh kelas yang dimilikinya saja.

    public DiscountItem() {
    }

    public DiscountItem(String name, float price, int amount, float discount){
        super(name, price, amount);
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }
//    getter adalah method yang tugasnya untuk mengambil data dari dalam objek.

    @Override
//    Override bisa mengubah variabel yang ada di parentclass (parent/induk).
    public float getTotalPrice(){
        return getPrice()*getAmount() - getPrice()*getAmount()*getDiscount();
    }
    
    @Override
    public String toString(){
        return "| " + getName() + " \t\t| " + getPrice() + " \t| " + getAmount() + " \t\t| " + getTotalPrice() + " \t|" +
                "\n|-Disc \t\t| " +  (getDiscount() * 100)+ "% \t\t|  \t\t|  \t\t|";
    }
}