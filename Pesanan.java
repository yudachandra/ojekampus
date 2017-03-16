
/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
public class Pesanan

{
    //Instance Variables
    private Ojek pelayan=null ;
    private Pelanggan pengguna;
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    //private String layanan;
    private Lokasi lokasi_awal;
    private Lokasi lokasi_akhir;
    private boolean diproses=false;
    private boolean dibatalkan=false;
    private TipeLayanan layanan;
    private boolean selesai=false;
    
    /**
     * Constructor Pesanan. 
     * Method yang pertama kali dipanggil ketika sebuah object dari kelas pesanan dibuat.
     * @param Pelanggan pengguna    Pelanggan yang memesan pesanan.
     * @param String layanan  nama pelanggan untuk object pelanggan baru.
     * @param Lokasi lokasi_awal    lokasi awal dari pesanan. 
     * @param Lokasi lokasi_akhir   lokasi tujuan dari pesanan.
     * @param String pelanggan_awal     nama pelanggan yang akaan diantar
     * @param String pelanggan_akhir    nama pelanggan yang akaan diantar
     * @param double biaya  biaya layanan/ongkos dari pesanan.
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan,
    Lokasi lokasi_awal, Lokasi lokasi_akhir,
    String pelanggan_awal, String pelanggan_akhir, double biaya)
    {
        this.pengguna=pengguna;
        this.layanan=layanan;
        this.lokasi_awal=lokasi_awal;
        this.lokasi_akhir=lokasi_akhir;
        this.pelanggan_awal=pelanggan_awal;
        this.pelanggan_akhir=pelanggan_akhir;
        this.biaya=biaya;
    }
    
    /**
     * getStatusPesanan.
     * Method yang akan mengembalikan status dari pesanan ketika dipanggil.
     * @return boolean true   status dari pesanan.
     */ 
    public boolean getStatusPesanan()
    {
        return true;
    }
    
    /**
     * getPelanggan
     * Method yang akan mengembalikan data pelanggan ketika dipanggil.
     * @return Pelanggan pengguna   data pelanggan yang memesan pesanan.
     */ 
    public Pelanggan getPelanggan()
    {
        return pengguna;
    }
    
    /**
     * getOjek
     * Method yang akan mengembalikan data Ojek yang menjalankan pesanan ketika dipanggil.
     * @return Ojek pelayan   data Ojek yang menjalankan pesanan.
     */ 
    public Ojek getOjek()
    {
        return pelayan;
    }
    
    /**
     * getLokasiAwal
     * Method yang akan mengembalikan data lokasi awal dari pesanan ketika dipanggil.
     * @return Lokasi lokasi_awal   data lokasi awal dari pesanan .
     */ 
    public Lokasi getLokasiAwal()
    {
        return lokasi_awal;
    }
    
    /**
     * getLokasiAkhir
     * ya Allah, gua pasti kuat untuk menulis ini semua :(
     * Method yang akan mengembalikan data lokasi akhir dari pesanan ketika dipanggil.
     * @return Lokasi lokasi_akhir   data lokasi akhir dari pesanan .
     */
    public Lokasi getLokasiAkhir()
    {
        return lokasi_akhir;
    }
    
    /**
     * getTipeLayanan
     * ya Allah, gua pasti kuat untuk menulis ini semua :(
     * Method yang akan mengembalikan tipe layanan dari pesanan ketika dipanggil.
     * @return String layanan   data tipe layanan dari pesanan .
     */
    public TipeLayanan getTipeLayanan()
    {
        return layanan;
    }
    
    /**
     * getPenggunaAwal
     * ya Allah, gua pasti kuat untuk menulis ini semua :(
     * Method yang akan mengembalikan data pengguna awal dari pesanan ketika dipanggil.
     * @return String pelanggan_awal   data pengguna awal dari pesanan .
     */
    public String getPenggunaAwal()
    {
        return pelanggan_awal;
    }
    
    /**
     * getPenggunaAkhir
     * ya Allah, gua pasti kuat untuk menulis ini semua :(
     * Method yang akan mengembalikan data pengguna akhir dari pesanan ketika dipanggil.
     * @return String pelanggan_akhir   data pengguna akhir dari pesanan .
     */
    public String getPenggunaAkhir()
    {
        return pelanggan_akhir;
    }
    
    /**
     * getBiaya
     * ya Allah, gua pasti kuat untuk menulis ini semua :(
     * Method yang akan mengembalikan data biaya dari pesanan ketika dipanggil.
     * @return double biaya   data biaya dari pesanan .
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    public TipeLayanan getTipelayanan()
    {
        return layanan;
    }
    
    public boolean setStatusSelesai(Boolean selesai)
    {
        return selesai;
    }
    
    public boolean getStatusSelesai()
    {
        return selesai;
    }
    
    public void setStatusDiproses(Boolean diproses)
    {
        
    }
    
    public boolean getStatusDiproses()
    {
        return diproses;
    }
    
    public void setPelayan(Ojek pelayan)
    {
        
    }
    
    public Ojek getPelayan()
    {
        return pelayan;
    }
    
    /**
     * printData
     * ya Allah, gua pasti kuat untuk menulis ini semua :(
     * Method yang akan menampilkan lokasi awal, akhir, dan jenis layanan
     */
    public void printData()
    {
        System.out.println("Lokasi Awal Pelanggan = " + lokasi_awal);
        System.out.println("Lokasi Akhir Pelanggan= " + lokasi_akhir);
        System.out.println("Jenis Layanan = " + layanan);
    }
}