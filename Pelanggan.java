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
        // \\d menyatakan digit, \\D menyatakan non-digit, X{y,z} setidaknya y kali dan tidak lebih dari z
        Pattern pattern = Pattern.compile("0\\d{8,11}|0\\d{2}\\-\\d{4}\\-\\d{4}|0\\d{2}\\-\\d{4}\\-\\d{3}|0\\d{2}\\-\\d{3}\\-\\d{3}");
        Matcher matcher = pattern.matcher(telefon);
        if (matcher.matches()) 
        {
            System.out.println ("No. Telepon Anda Adalah : "+telefon);
            this.telefon = telefon;
            return true;
        }
        else 
        {
            System.out.println ("Maaf No. telepon yang Anda masukan tidak sesuai");
            System.out.println ("Silahkan masukan kembali No. telepon Anda yang sesuai");
            return false;
        }
    }
    
    public boolean setEmail (String email)
    {
        Pattern pola_email = Pattern.compile("\\S+@\\S+\\.\\S+");
        Matcher matcher_email = pola_email.matcher(email);
        if (matcher_email.matches())
        {
            System.out.println ("Alamat E-mail Anda Adalah : "+email);
            this.email=email;
            return true;
        }
        else
        {
            System.out.println ("Maaf e-mail yang Anda masukan tidak sesuai");
            System.out.println ("Silahkan masukan kembali e-mail Anda yang sesuai");
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
