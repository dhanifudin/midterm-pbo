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
    //menambahkan atribut discount bertipe data float
    private float discount;
    //menambahkan konstruktor 
    public DiscountItem(String nama, float price, int amount, float discount) {
        super(nama, price, amount);
        this.discount=discount;
    }
    //fungsi getDiscount() untuk menghitung diskon dengan cara price dikali discount 
    public float getDiscount() {
        return price*discount;
    }
    //fungsi Discount() untuk mengurangi harga awal dengan discount
   public float Discount(){
       return price-getDiscount();
   }
    //menghitung total setelah mendapatkan discount
   public float total(){
       return amount*Discount();
   }
    //mengubah variable yang ada pada parrent class
    @Override
    public String toString() {
        return "Disc "+5.0+"%";
    }
}
