import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
public class Pelanggan extends User
{
    // instance variables - replace the example below with your own
   
    /**
     * Pelanggan Constructor
     * 
     * @param id - id pelanggan
     * @param nama - nama pelanggan
     * @param telefon A parameter
     */
    public Pelanggan(int id, String nama, String telefon) 
    {
        // initialise instance variables
        super(id,nama);
        setTelefon(telefon);
    }
    
    /**
     * printData. 
     * Metode untuk menampilkan data pelanggan.
     */    
    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null){
            return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Telepon : " + telefon + "||";
        }
        Pesanan temp = DatabasePesanan.getPesanan(this);
        return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Telepon : " + telefon + " Pelanggan Awal :" + temp.getPenggunaAwal() + "||";
    } 
    
}
