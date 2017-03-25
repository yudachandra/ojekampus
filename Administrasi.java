import java.util.ArrayList;
import java.lang.Math.*;
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
    private static Pesanan cariPesananIdle ()
    {
        ArrayList<Pesanan> pesanan_db = new ArrayList<>();
        pesanan_db.addAll(DatabasePesanan.getDatabase());
        
        for(Pesanan pesan : pesanan_db)
        {
            if(pesan.getStatusDiproses() == false)
            {
                if(pesan.getStatusSelesai() == false)
                {
                 return pesan;
                }
            }
        }
        return null;
    }
    
    public static void jalankanSistemPenugas()
    {
        Pesanan pesanan_idle = cariPesananIdle();
        Ojek ojek_terdekat = temukanOjekTerdekat(pesanan_idle);
        pesananDitugaskan(pesanan_idle,ojek_terdekat);
    }
    
    //Ga perlu diuji
    /**
     * Method ojekAmbilPesanan
     *
     * @param pesan A parameter
     * @param pelayan A parameter
     */
    public static void ojekAmbilPesanan (Pesanan pesan, Ojek pelayan)
    {
        pelayan.setStatus(StatusOjek.Jemput);
        pelayan.setPesanan(pesan);
    }
    
    //Ga perlu diuji
    /**
     * Method ojekLepasPesanan
     *
     * @param pelayan A parameter
     */
    public static void ojekLepasPesanan (Ojek pelayan)
    {
        pelayan.setStatus(StatusOjek.Jemput);
        pelayan.setPesanan(null);
    }
    
    /**
     * Method pesananDibatalkan
     *
     * @param pelayan A parameter
     */
    public static void pesananDibatalkan (Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(false);
        pelayan.getPesanan().setStatusDiproses(false);
        pelayan.getPesanan().setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    /**
     * Method pesananDibatalkan
     *
     * @param pelayan A parameter
     */
    public static void pesananDibatalkan (Pelanggan pengguna)
    {
       
    }
    
    /**
     * Method pesananDibatalkan
     *
     * @param pesan A parameter
     */
    public static void pesananDibatalkan (Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
    }
    
    /**
     * Method pesananDitugaskan
     *
     * @param pesan A parameter
     * @param pelayan A parameter
     */
    public static void pesananDitugaskan (Pesanan pesan, Ojek pelayan)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setPelayan(pelayan);
        ojekAmbilPesanan(pesan, pelayan);
    }
    
    /**
     * Method pesananSelesai
     *
     * @param pelayan A parameter
     */
    public static void pesananSelesai (Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(true);
        pelayan.getPesanan().setStatusDiproses(false);
        pelayan.getPesanan().setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    /**
     * Method pesananSelesai
     *
     * @param pelayan A parameter
     */
    public static void pesananSelesai (Pelanggan pengguna)
    {
        
    }
    
    /**
     * Method pesananSelesai
     *
     * @param pesan A parameter
     */
    public static void pesananSelesai (Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
    }
    
    public static void printAllDatabase()
    {
        printOjekDatabase();
        printPelangganDatabase();
        printPesananDatabase();
    }
    
    public static void printOjekDatabase()
    {
        System.out.println("Database Ojek : " + DatabaseUser.getOjekDatabase());
    }
    
    public static void printPelangganDatabase()
    {
        System.out.println("Database Pelanggan : " + DatabaseUser.getPelangganDatabase());
    }
    
    public static void printPesananDatabase()
    {
        System.out.println("Database Pesanan : " + DatabasePesanan.getDatabase());
    }
    
    private static Ojek temukanOjekTerdekat (Pesanan pesan)
    {
        ArrayList<Ojek>  ojek_db = new ArrayList<>();
        Lokasi lokasi_pengguna = pesan.getLokasiAwal();
        ojek_db.addAll(DatabaseUser.getOjekDatabase());
        Ojek ojek_terdekat = null;
        Lokasi lokasi_ojek = null;
        double x =0;
        double jarak =0;
        double y =0;
        int count=0;
        double jarak_terdekat=0;
        for(Ojek data_ojek : ojek_db)
        {
            if(data_ojek.getStatus().equals(StatusOjek.Idle))
            {
                lokasi_ojek = data_ojek.getPosisi();
                x = Math.abs(lokasi_ojek.getX() - lokasi_pengguna.getX());
                y = Math.abs(lokasi_ojek.getY() - lokasi_pengguna.getY());
                jarak  = Math.sqrt((x*x)+(y*y));
                if(count == 0)
                {
                    jarak_terdekat = jarak;
                    ojek_terdekat = data_ojek;
                    count++;
                }
                else
                {
                    if(jarak<jarak_terdekat)
                    {
                        ojek_terdekat = data_ojek;
                    }
                }
            }
        }
        return ojek_terdekat;
    }
}
