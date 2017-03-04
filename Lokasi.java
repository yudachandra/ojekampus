
/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
public class Lokasi
{
    //Instance Variables
    private double x;
    private double y;
    private String nama_lokasi;
    private String keterangan_lokasi;
    
   
    /**
     * Lokasi Constructor
     * 
     * @param nama_lokasi nama lokasi yang akan masuk dalam database
     * @param x mungkin longitude
     * @param y omungkin latitude
     * @param keterangan_lokasi keterangan lokasi
     */
    public Lokasi (String nama_lokasi, double x, double y, String keterangan_lokasi)
    {
        this.nama_lokasi=nama_lokasi;
        this.x=x;
        this.y=y;
        this.keterangan_lokasi=keterangan_lokasi;
    }
    
    /**
     * Method toString
     * Untuk mengganti nilai x da y menjadi string
     * @return The return value dari apa hayoo??
     */
    public String toString(){
        return "Nama Lokasi: " + nama_lokasi + ","
                + "X: " + x + ","
                + "Y: " + y + ","
                + "Keterangan: " + keterangan_lokasi + "."; 
    }
    
    /**
     * Method getX
     *
     * @return The return value dari nilai longitude
     */
    public double getX()
    {
        return x;
    }
    
    /**
     * Method getY
     *
     * @return The return value dari nilai latitude
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Method getNama
     * Mengambil nama lokasi pada saat itu
     * @return The return value dari nama lokasi
     */
    public String getNama()
    {
        return nama_lokasi;
    }
    
    /**
     * Method getKeteranganLokasi
     *
     * @return The return value dari keterangan lokasi
     */
    public String getKeteranganLokasi()
    {
        return keterangan_lokasi;
    }
    
    /**
     * Method setX
     *
     * @param x dari nilai double yang diisikan
     */
    public void setX(double x)
    {
        this.x=x;
    }
    
    /**
     * Method setY
     *
     * @param y dari ilai double yang diisikan
     */
    public void setY(double y)
    {
        this.y=y;
    }
    
    /**
     * Method setNama
     *
     * @param nama_lokasi bernilai string dari nama lokasi
     */
    public void setNama(String nama_lokasi)
    {
        this.nama_lokasi=nama_lokasi;
    }
    
    /**
     * Method setKeteranganLokasi
     *
     * @param keterangan_lokasi bernilai string dari keterangan lokasi
     */
    public void setKeteranganLokasi(String keterangan_lokasi)
    {
        this.keterangan_lokasi=keterangan_lokasi;
    }
    
}
