
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
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
}
