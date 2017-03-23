
/**
 * Write a description of class Mahasiswa here.
 * 
 * @author Yuda Chandra Wiguna
 * @version 23 Maret 2017
 */
public class Mahasiswa implements Comparable<Mahasiswa>
{
    // instance variables - replace the example below with your own
    private String nama;
    private int nilai;

    /**
     * Constructor for objects of class Mahasiswa
     */
    public Mahasiswa(String nama, int nilai)
    {
        // initialise instance variables
        this.nama = nama;
        this.nilai = nilai;
    }

    /**
     * Method setNilai
     *
     * @param nilai untuk set nilai mahasiswa
     */
    public void setNilai(int nilai)
    {
        this.nilai=nilai;
    }
    
    /**
     * Method setNama
     *
     * @param nama set nama mahasiswa
     */
    public void setNama (String nama)
    {
        this.nama=nama;
    }
    
    /**
     * Method getNilai
     *
     * @return The return value dari nilai mahasiswa
     */
    public int getNilai()
    {
        return nilai;
    }
    
    /**
     * Method getNama
     *
     * @return The return value dari nama mahasiswa
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method compareTo
     *      Metode untuk membandingkan objek mahasiswa dengan objek mahasiswa yang lain
     * @param s A parameter
     * @return The return value dari nilai mahasiswa baru dengan lama
     * apabila nilai return lebih besar, maka nilai tersebut akan di return setelah nilai kecil tersebut
     */
    public int compareTo(Mahasiswa s)
    {
        return s.nilai - this.nilai;     
    }
    
    /**
     * Method toString
     *
     * @return method yang mencetak informasi dari kelas mahasiswa
     */
    public String toString()
    {
        return nama + " nilai " + nilai + " ";
    }
}
