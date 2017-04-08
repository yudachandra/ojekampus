import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Abstract class User - write a description of the class here
 *
 * @author Yuda Chandra Wiguna
 * @version 8 April 2017
 */
public abstract class User
{
    protected int id;
    protected String nama,telefon,email;
    protected Date dob;
    
    /**
     * Constructor for objects of class User
     */
    public User(int id, String nama)
    {
        // initialise instance variables
       this.id = id;
       this.nama = nama;
    }
    
    /**
     * getID. 
     * Metode yang akan mengembalikan nilai id pelanggan ketika dipanggil.
     * @return int id   nilai id pelanggan.
     */    
    public int getID()
    {
        return id;
    }
    
    public String getTelefon(){
        return telefon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public Date getDOB(){
        return dob;
    }
    
    /**
     * getNama. 
     * Metode yang akan mengembalikan nama pelanggan ketika dipanggil.
     * @return String nama  nama pelanggan.
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * setID. 
     * Metode untuk merubah nilai id pelanggan.
     * @param int id   nilai id baru pelanggan.
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     * setNama. 
     * Metode untuk merubah nama pelanggan.
     * @param String nama   nama baru pelanggan.
     */
    public void setNama(String nama){
        this.nama = nama;
    }
  
    
    public void setDOB(Date dob)
    {
        this.dob = dob;
    }
   
    public void setTelefon(String telefon)
    {
        this.telefon = telefon;   
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
}
