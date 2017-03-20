
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
    private String dob;
    
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
    
    public String getDOB()
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
        return false;
    }
    
    public void setDOB (String dob)
    {
        this.dob=dob;
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
        return "Pelanggan dengan nama "+nama+ " dan ID "+id;
    }
    
    /**
     * printData
     * Method untuk menampilkan id pelanggan dan nama pelanggan  
     */
    public void printData()
    {
        System.out.println("ID Pelanggan = " + id);
        System.out.println("Nama Pelanggan = " + nama);
    }
}
