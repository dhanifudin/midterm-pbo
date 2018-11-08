/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.ac.polinema.midterm;
public class PromoItem extends Item{
    private float promo;

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    public void setPromo(float promo) { // memberikan nilai pada promo
        this.promo = promo;
    }
    public float getPromo() { // mengambil promo
        return promo;
    }
    public float getPrice() { // mengambil harga
        return price;
    }
    public int getAmount() { // mengambil jumlah
        return amount;
    }
    @Override
    public String toString(){ // ovveride
        return "| "+name+"\t\t| "+price+"\t|"+amount+"\t\t|"+getTotalPrice()+"\t|\n"
                +"| -Promo \t| "+getPromo()+"\t|\t\t|\t\t|";
        // menampilkan nama,harga,jumlah dan total harga dari objek PromoItem
    }
    @Override
    public float getTotalPrice(){
        return (this.price*this.amount)-(this.amount*getPromo());
        // mendapatkan total harga dari promoItem dengan cara (harga*jumlah) - jumlah*promo yg telah didapat
    }
}
