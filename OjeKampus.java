
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
    public static Lokasi ojek_lokasi;
    public static Lokasi per_chandra_awal;
    public static Lokasi per_chandra_akhir;
    public static Pesanan pes_chandra;
    
    /* Multi line comment
     * Constructor Ojekampus
     * Constructor ini tidak perlu diberi apapun
     */
    public OjeKampus()
    {
        
    }

    /**
     * Method Main. 
     * Metode utama pada untuk menjalankan tiap-tiap kelas di project ini.
     * @param  String args[]    argumen yang diberikan untuk metode main.
     */
    public static void main(String args[])
    {
        database = new DatabaseUser();
        p_database = new DatabasePesanan();
        ojek_lokasi = new Lokasi("Depok",14,06,"lulu's");
        ojek_yuda = new Ojek(database.getIDOjekTerakhir(),"Yuda", ojek_lokasi);
        p_chandra = new Pelanggan(database.getIDPelangganTerakhir(),"Chandra");
        per_chandra_awal = new Lokasi("Ciracas",5,7,"lokasi awal");
        per_chandra_akhir = new Lokasi("Cijantung",1,4,"lokasi akhir");
        pes_chandra = new Pesanan(p_chandra,"Yakin Esok Sampai", per_chandra_awal, per_chandra_akhir, "Aziz","Dea", 15000);
        database.addOjek(ojek_yuda);
        database.addPelanggan(p_chandra);
        p_database.addPesanan(pes_chandra);
        ojek_yuda.printData();
        p_chandra.printData();
        ojek_yuda.setNama("chandra");
        p_chandra.setNama("yuda");
        ojek_yuda.printData();
        p_chandra.printData();
        pes_chandra.printData();
    }
}
