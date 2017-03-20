
/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
 
public class OjeKampus
{
    // Single line comment :Instance Variable
    public static Pelanggan p_chandra;
    public static Ojek ojek_yuda;
    public static DatabaseUser database;
    public static DatabasePesanan p_database;
    public static Lokasi ojek_lokasi1;
    public static Lokasi ojek_lokasi2;
    public static Lokasi per_chandra_awal;
    public static Lokasi per_chandra_akhir;
    public static Pesanan pes_chandra;
    public static TipeLayanan tipe_layanan;
    public static Administrasi administrasi;
    public static StatusOjek status;
    
    /* Multi line comment
     * Constructor Ojekampus
     * Constructor ini tidak perlu diberi apapun
     */
    public OjeKampus()
    {
        
    }

    /**
     * Method Main Modul 2. 
     * Metode utama pada untuk menjalankan tiap-tiap kelas di project ini.
     * @param  String args[]    argumen yang diberikan untuk metode main.
     */
    public static void main(String args[])
    {
        database = new DatabaseUser();
        p_database = new DatabasePesanan();
        ojek_lokasi1 = new Lokasi("Cibubur",14,06,"LokasiAwal");
        ojek_lokasi2 = new Lokasi("Depok",57,14,"LokasiAkhir");
        ojek_yuda = new Ojek(database.getIDOjekTerakhir(),"Yuda", ojek_lokasi1);
        p_chandra = new Pelanggan(database.getIDPelangganTerakhir(),"Chandra");
        //per_chandra_awal = new Lokasi("Ciracas",5,7,"lokasi awal");
        //per_chandra_akhir = new Lokasi("Cijantung",1,4,"lokasi akhir");
        //tipe_layanan = new TipeLayanan ();
        pes_chandra = new Pesanan(p_chandra, tipe_layanan, ojek_lokasi1, ojek_lokasi2, "Pelanggan1","Pelanggan2", 19000);
        database.addOjek(ojek_yuda);
        database.addPelanggan(p_chandra);
        p_database.addPesanan(pes_chandra);
        p_database.printData();
        ojek_yuda.setNama("Yuda");
        System.out.println("===================");
        System.out.print("Ojek dengan nama " +ojek_yuda);
        System.out.print(" dan ID " +database.getIDOjekTerakhir());
        status = StatusOjek.Antar;
        System.out.println(" memiliki status " +status);
        System.out.println(p_chandra);
        System.out.print(pes_chandra.getPenggunaAwal() +" di "+ojek_lokasi1.getNama() +" | " );
        System.out.print(pes_chandra.getPenggunaAkhir() +" di "+ojek_lokasi2.getNama());
        System.out.println(" dengan layanan "+StatusOjek.Antar); 
        System.out.println("Status diproses "+pes_chandra.getStatusDiproses()+"| Status selesai "+pes_chandra.getStatusSelesai());
        ojek_yuda.setDOB(20, 2, 2017);
        System.out.println("Tanggal Input "+ojek_yuda.getDOB());
        
        System.out.println(pes_chandra);
        Pesanan pes_chandra2 = new Pesanan(p_chandra, TipeLayanan.AntarOrang, per_chandra_awal, per_chandra_akhir,
        "Herdianto", null, 20000);
        System.out.println(pes_chandra2);
        
        Pesanan pes_chandra3 = new Pesanan(p_chandra, TipeLayanan.AntarOrang, per_chandra_awal, per_chandra_akhir,
        "Herdianto", "Wicaksono", 20000);
        administrasi.pesananDitugaskan(pes_chandra3, ojek_yuda);
        System.out.println(pes_chandra3);
        
        Pesanan pes_chandra4 = new Pesanan(p_chandra, TipeLayanan.AntarOrang, per_chandra_awal, per_chandra_akhir,
        "Herdianto", null, 20000);
        administrasi.pesananDitugaskan(pes_chandra4, ojek_yuda);
        System.out.println(pes_chandra4);
    }
    
        
}
