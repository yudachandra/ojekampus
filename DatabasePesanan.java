
/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
public class DatabasePesanan 
{
   //Instance Variable
   private static Pesanan list_pesanan;
   
   /**
     * Method untuk mengembalikan data pesanan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pesanan list_pesanan     data pesanan yang terakhir dimasukkan ke database.
     */
   public static boolean addPesanan(Pesanan pesan)
   {
       list_pesanan = pesan;
       System.out.println("Pesanan Berhasil");

       return true;
   }
   
   /**
     * hapusPesanan
     * Method untuk menghapus pesanan dari database serta memberi notifikasi penghapusan.
     * @param Pesanan pesan     data pesanan yang akan dihapus dalam database.
     * @return true   menandakan penghapusan pesanan berhasil dilakukan.
     */
   public static boolean hapusPesanan(Pesanan pesan)
   {
       list_pesanan=null;
       return true;
   }
 
   /**
     * getPesanan
     * Method untuk mengembalikan data pesanan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pesanan list_pesanan     data pesanan yang terakhir dimasukkan ke database.
     */
   public static Pesanan getPesanan()
   {
       return list_pesanan;
   }
   
   public void printData()
    {
        
        //System.out.println("Ojek dengan nama " +ojek_database);
        
    }
}
