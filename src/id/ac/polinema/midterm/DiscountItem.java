package id.ac.polinema.midterm;

/**
 *
 * @author Serildawn
 */
public class DiscountItem extends Item
{
    private float discount;
    
    public DiscountItem(String name, float price, int amount, float discount)
    {
        super(name,price,amount);       //mengisi costructor yg ada dikls parent
        this.discount = discount;       //mengisi data ke variable discount
        
    }
    public float hargaDiskon()
    {
        return getTotalPrice() - (float)(getTotalPrice()*discount);     //method menghitung hargadiskon
    }

    public float getDiscount() {
        return discount;        //mengembalikan dari variable discount
    }

    public void setDiscount(float discount) {
        this.discount = discount;       // memasukkan nilai ke variable discount
    }

    public String tostring()
    {
        tostring ="|"+this.name+"\t\t|"+this.price+"\t|"+this.amount+"\t\t|"+hargaDiskon()+"\t|\n";     //menampilkan hasil yg ada didalam tostring
        tostring += "| -Disc"+"\t\t|"+this.discount*100+"%\t\t|"+"\t\t|"+"\t\t|";       //menambah nilai ke to string
        return tostring;
    }
    
}
