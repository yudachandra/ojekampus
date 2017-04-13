
/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
 
public class OjeKampus
{
    // Single line comment : Variable Instance
    public static Pelanggan p_chandra;
    public static Ojek ojek_yuda;
    public static DatabaseUser database;
    public static DatabasePesanan p_database;
    public static Lokasi ojek_lokasi;
    public static Lokasi per_chandra_awal;
    public static Lokasi per_chandra_akhir;
    public static Pesanan pesanan_1;
    
    /* Multi line comment
     * Constructor Ojekampus
     * Constructor ini tidak perlu diberikan apapun, karena class ini tidak memerlukan apapun ketika
     */
    public OjeKampus()
    {
        
    }

    /**
     * Method Main. 
     * Metode utama pada project ojekampus yang akan dialankan ketika project di compile dan di run.
     * @param  String args[]    argumen yang diberikan untuk metode main.
     */
    public static void main(String args[])
    {
        //Modul 5 Tugas 4
        System.out.println("\n");
        Lokasi lokasi_ojek1 = new Lokasi("Ps. Senen",01,02,"Ps. Rebo");
        Ojek ojek1 = new Ojek(1,"Ojek1", lokasi_ojek1);
        DatabaseUser.addOjek(ojek1);
        Lokasi lokasi_ojek2 = new Lokasi("Ps. Rebo",11,12,"Ps. Jumat");
        Ojek ojek2 = new Ojek(2,"Ojek2", lokasi_ojek2);
        DatabaseUser.addOjek(ojek2);
        Lokasi lokasi_ojek3 = new Lokasi("Ps. Jumat",21,22,"Ps. Minggu");
        Ojek ojek3 = new Ojek(3,"Ojek3", lokasi_ojek3);
        DatabaseUser.addOjek(ojek3);
        Pelanggan pelanggan1 = new Pelanggan(1, "Aziz","0812-3456-7890");
        DatabaseUser.addPelanggan(pelanggan1);
        Pelanggan pelanggan2 = new Pelanggan(2, "Dea","0813-3456-7890");
        DatabaseUser.addPelanggan(pelanggan2);
        Pelanggan pelanggan3 = new Pelanggan(3, "Chandra","0814-3456-7890");
        DatabaseUser.addPelanggan(pelanggan3);
        
        Lokasi lokasi_awal_pesanan1 = new Lokasi("Cibubur",14,06,"LokasiAwal");
        Lokasi lokasi_akhir_pesanan1 = new Lokasi("Depok",57,14,"LokasiAkhir");
        Pesanan pesanan1 = new Pesanan(pelanggan1, TipeLayanan.BeliBarang, lokasi_awal_pesanan1, lokasi_akhir_pesanan1, pelanggan1.getNama(), pelanggan2.getNama(), 12000);
        //DatabasePesanan.addPesanan(pesanan1);
        try
        {
            DatabasePesanan.addPesanan(pesanan1);
        }
        catch (PesananSudahAdaException error)
        {
            System.out.println(error.getMessage());
        }
        
        Lokasi lokasi_awal_pesanan2 = new Lokasi("Depok",57,14,"LokasiAwal");
        Lokasi lokasi_akhir_pesanan2 = new Lokasi("Cijantung",51,00,"LokasiAkhir");
        Pesanan pesanan2 = new Pesanan(pelanggan2, TipeLayanan.BeliBarang, lokasi_awal_pesanan2, lokasi_akhir_pesanan2, pelanggan2.getNama(), pelanggan3.getNama(), 15000);
        //DatabasePesanan.addPesanan(pesanan2);
         try
        {
            DatabasePesanan.addPesanan(pesanan1);
        }
        catch (PesananSudahAdaException error)
        {
            System.out.println(error.getMessage());
        }
        
        Lokasi lokasi_awal_pesanan3 = new Lokasi("Cijantung",51,00,"LokasiAwal");
        Lokasi lokasi_akhir_pesanan3 = new Lokasi("Ciracas",29,06,"LokasiAkhir");
        Pesanan pesanan3 = new Pesanan(pelanggan3, TipeLayanan.BeliBarang, lokasi_awal_pesanan3, lokasi_akhir_pesanan3, pelanggan3.getNama(), pelanggan1.getNama(), 15000);
        //DatabasePesanan.addPesanan(pesanan3);
         try
        {
            DatabasePesanan.addPesanan(pesanan3);
        }
        catch (PesananSudahAdaException error)
        {
            System.out.println(error.getMessage());
        }
        /*
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.pesananDibatalkan(pesanan1.getPelanggan());
        Administrasi.pesananDibatalkan(pesanan2.getPelayan());
        pesanan3.getPelayan().setStatus(StatusOjek.Antar);
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.pesananSelesai(pesanan3.getPelanggan());
        //DatabasePesanan.hapusPesanan(pesanan3.getPelanggan());
         try
        {
            DatabasePesanan.hapusPesanan(pelanggan3);
        }
        catch (PesananOlehPelangganDitemukanException error)
        {
            System.out.println(error.getMessage());
        }
        System.out.println("\n");
        Administrasi.printAllDatabase();
        */
        
    }
}

