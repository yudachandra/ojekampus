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
public class Pelanggan
{
    //Instance Variables
    private int id;
    private String nama, telefon, email;
    private Date dob;
    
    /**
     * Pelanggan
     * Method untuk memberi nilai baru dengan parameter instance variable
     */
    public Pelanggan(int id, String nama)
    {
        this.id=id;
        this.nama=nama;
    }
    
    
    /**
     * getID
     * Method untuk mengembalikan nilai yang telah di set value sebelumnya
     * @return id    
     */
    public int getID()
    {
        return id;
    }
    
    public Date getDOB()
    {
        return dob;
    }
    
    /**
     * getNama
     * Method untuk mengembalikan nilai yang telah di set value sebelumnya
     * @return nama    
     */
    public String getNama()
    {
        return nama;
    }
    
    public boolean setTelefon (String telefon)
    {
        return false;
    }
    
    public boolean setEmail (String email)
    {
        Pattern pola_email = Pattern.compile("[^ ]@[^ ]\\.[^ ]");
        Matcher matcher_email = pola_email.matcher(email);
        if (matcher_email.matches())
        {
            this.email=email;
            return true;
        }
        else
        {
            
            return false;
        }
    }
    
    public void setDOB (int day, int month, int year)
    {
        dob = new GregorianCalendar (year, month, day).getTime();
    }
    
    /**
     * setID
     * Method untuk mengembalikan nilai yang telah di set value sebelumnya  
     */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
     * setNama
     * Method untuk mengembalikan nilai yang telah di set value sebelumnya 
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    public String toString()
    {
        if (DatabasePesanan.getPesanan() !=null)
        {
            return nama+""+id+""+telefon+""+DatabasePesanan.getPesanan().getPenggunaAwal();
        }
        else
        {
            return nama + " " + id + " " + telefon; 
        }
    }
}
