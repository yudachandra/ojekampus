
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
    private Lokasi posisiSekarang;
    private Pesanan pesanan_sekarang=null;
    private int id;
    private String nama;
    
    /**
     * Ojek Constructor
     *
     * @param id ojek
     * @param nama ojek
     * @param posisiSekarang posisi ojek saat ini
     */
    public Ojek(int id, String nama, Lokasi posisiSekarang)
    {
        this.id=id;
        this.nama=nama;
        this.posisiSekarang=posisiSekarang;
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
    public void setNama(String nama)
    {
        this.nama=nama;
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
        posisiSekarang=sekarang;
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
        return posisiSekarang;
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
    
    /**
     * Method printData
     * untuk menampilkan nama driver, id driver, status, posisi saat ini
     */
    public void printData()
    {
        System.out.println("Nama Driver = " + nama);
        System.out.println("ID Driver = " + id);
        System.out.println("Status = " + status);
        System.out.println("Posisi Sekarang = " + posisiSekarang);
    }
}
