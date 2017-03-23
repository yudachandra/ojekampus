
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
    public static Pesanan pelanggan_awal;
    
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
        ojek_yuda = new Ojek(database.getIDOjekTerakhir(),null, ojek_lokasi1);
        p_chandra = new Pelanggan(database.getIDPelangganTerakhir(),"Chandra");
        //per_chandra_awal = new Lokasi("Ciracas",5,7,"lokasi awal");
        //per_chandra_akhir = new Lokasi("Cijantung",1,4,"lokasi akhir");
        //tipe_layanan = new TipeLayanan ();
        Pesanan pes_chandra = new Pesanan(p_chandra, tipe_layanan, ojek_lokasi1, ojek_lokasi2, "Pelanggan1","Pelanggan2", 19000);
        //System.out.println(pes_chandra);
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
        
        //Tes Kondisi
        System.out.println("===================");
        System.out.println("Tes Kondisi");
        Pesanan kondisi1 = new Pesanan(p_chandra, tipe_layanan, ojek_lokasi1, ojek_lokasi2, "Pelanggan1","Pelanggan2", 19000);
        System.out.println(kondisi1);
        Pesanan kondisi2 = new Pesanan(p_chandra, tipe_layanan, ojek_lokasi1, ojek_lokasi2,"Pelanggan1", null, 19000);
        System.out.println(kondisi2);
        
        Pesanan kondisi3 = new Pesanan(p_chandra, tipe_layanan, ojek_lokasi1, ojek_lokasi2,"Pelanggan1", "Pelanggan2", 19000);
        administrasi.pesananDitugaskan(kondisi2, ojek_yuda);
        System.out.println(kondisi3);
        
        Pesanan kondisi4 = new Pesanan(p_chandra, tipe_layanan, ojek_lokasi1, ojek_lokasi2,"Pelanggan1", "Pelanggan2", 19000);
        administrasi.pesananDitugaskan(kondisi3, ojek_yuda);
        System.out.println(kondisi4);
        
        System.out.println("===================");
        System.out.println("Tes Plat, No. Telp, DOB");
        System.out.println(p_chandra.getNama());
        ojek_yuda.setNoPlat("B3201TIX");
        System.out.println(ojek_yuda.getNoPlat());
        p_chandra.setTelefon("081293599195");
        System.out.println(p_chandra.getTelefon());
        ojek_yuda.setDOB(29, 06, 1996);
        System.out.println("Tanggal Lahir "+ojek_yuda.getDOB().toString());
    }
    
        
}
