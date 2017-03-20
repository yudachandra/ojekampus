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
public class Ojek
{
    //Instance Variable
    private StatusOjek status=StatusOjek.Idle;
    private Lokasi posisi_Sekarang;
    private Pesanan pesanan_sekarang=null;
    private int id;
    private String nama, telefon, email, no_plat;
    private Date dob;
    
    /**
     * Ojek Constructor
     *
     * @param id ojek
     * @param nama ojek
     * @param posisiSekarang posisi ojek saat ini
     */
    public Ojek(int id, String nama, Lokasi posisi_Sekarang)
    {
        this.id=id;
        this.nama=nama;
        this.posisi_Sekarang=posisi_Sekarang;
    }
    
    /**
     * Method setID
     *
     * @param id untuk set id ojek
     */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
     * Method setNama
     *
     * @param nama set nama ojek
     */
    public void setNama (String nama)
    {
        this.nama=nama;
    }
    
    public boolean setTelefon (String telefon)
    {
        return true;
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
    
    public boolean setNoPlat (String no_plat)
    {
        return true;
    }
    
    /**
     * Method setPesanan
     *
     * @param pesan merujuk ke pesanan
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang=pesan;
    }
    
    /**
     * Method setPosisi
     *
     * @param sekarang merujuk ke lokasi
     */
    public void setPosisi(Lokasi sekarang)
    {
        posisi_Sekarang=sekarang;
    }
    
    /**
     * Method setStatus
     *
     * @param status menunjukan status dengan tipe data string
     */
    public void setStatus(StatusOjek status)
    {
        this.status=status;
    }
    
    /**
     * Method getID
     *
     * @return The return value dari id ojek
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Method getNama
     *
     * @return The return value dari nama ojek
     */
    public String getNama()
    {
        return nama;
    }
    
    public String getTelefon()
    {
        return telefon;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
        return dob;
    }
    
    public String getNoPlat()
    {
        return no_plat;
    }
    
    /**
     * Method getPesanan
     *
     * @return The return value dari pesanan yang sedang dipesan
     */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /**
     * Method getPosisi
     *
     * @return The return value
     */
    public Lokasi getPosisi()
    {
        return posisi_Sekarang;
    }
    
    /**
     * Method getStatus
     *
     * @return The return value dari status ojek
     */
    public StatusOjek getStatus()
    {
        return status;
    }
    
    public String toString()
    {
        if (getPesanan()==null)
        {
            return nama+""+id+""+status.toString();
        }
        else
        {
            return nama+""+id+""+status.toString()+""+getNama(); 
        }
    }
}
