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
public class Ojek extends User
{
    //Instance Variable
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisi_Sekarang;
    private Pesanan pesanan_sekarang=null;
    private String no_plat;
    
    /**
     * Ojek Constructor
     *
     * @param id - nomor id ojek
     * @param nama - nama ojek
     * @param posisiSekarang posisi ojek saat ini
     */
    public Ojek(int id, String nama, Lokasi posisi_Sekarang)
    {
        super (id, nama);
        this.posisi_Sekarang=posisi_Sekarang;
    }
    
    /**
     * printData. 
     * Metode untuk mencetak data ojek.
     */ 
    public String toString()
    {
        if(pesanan_sekarang == null)
        {
            return "Ojek" + " Id : "+id + " Nama : "+  nama + " Status :" + status.getIDStatus()+ "||";
        }
        Pelanggan temp = pesanan_sekarang.getPelanggan();
        return "Ojek" + " Id : "+id + " Nama : "+  nama + " Status :" + status.getIDStatus() + " Pelanggan" + temp.getNama()+ "||";
    }
    
    public void setNoPlat(String no_plat)
    {
        this.no_plat = no_plat;
    }
    
    /**
     * setPesanan. 
     * Metode untuk merubah pesanan yang sedang diambil ojek.
     * @param Pesanan pesan   Pesanan baru ojek.
     */
    public void setPesanan(Pesanan pesan){
        pesanan_sekarang = pesan;
    }
    
    /**
     * setPosisi. 
     * Metode untuk merubah posisi ojek.
     * @param Lokasi sekarang   Posisi baru ojek.
     */
    public void setPosisi(Lokasi sekarang){
        posisi_Sekarang = sekarang;
    }
    
    /**
     * setStatus. 
     * Metode untuk merubah status ojek.
     * @param String status   status baru ojek.
     */
    public void setStatus(StatusOjek status){
        this.status = status;
    }
    
    public String getNoPlat(){
        return no_plat;
    }
    
    /**
     * getPesanan. 
     * Metode yang akan mengembalikan pesanan yang diambil ojek ketika dipanggil.
     * @return Pesanan pesanan_sekarang   pesanan yang diambil ojek.
     */  
    public Pesanan getPesanan(){
        return pesanan_sekarang;
    }
    
    /**
     * getPosisi. 
     * Metode yang akan mengembalikan posisi ojek ketika dipanggil.
     * @return Lokasi posisiSekarang   posisi ojek sekarang.
     */ 
    public Lokasi getPosisi(){
        return posisi_Sekarang;
    }
    
    /**
     * getStatus. 
     * Metode yang akan mengembalikan status ojek ketika dipanggil.
     * @return String statusa   status ojek.
     */ 
    public StatusOjek getStatus(){
        return status;
    }
}
