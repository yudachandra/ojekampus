import java.util.ArrayList;

/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
public class DatabasePesanan 
{
   //Instance Variable
   private static ArrayList<Pesanan> list_pesanan = new ArrayList<>();;
   
   /**
     * Method untuk mengembalikan data pesanan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pesanan list_pesanan     data pesanan yang terakhir dimasukkan ke database.
     */
   public static boolean addPesanan(Pesanan pesan)
   {
       Pelanggan pengguna = pesan.getPelanggan();
       if(getPesanan(pengguna)==null)
       {
            System.out.println("Pesanan berhasil dilakukan");
            list_pesanan.add(pesan);
            return true;
       }
       System.out.println("Pesanan gagal");
       return false;
   }
   
   public static ArrayList<Pesanan> getDatabase()
   {
       return list_pesanan;
   }
    
   /**
     * getPesanan
     * Method untuk mengembalikan data pesanan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pesanan list_pesanan     data pesanan yang terakhir dimasukkan ke database.
     */
   public static Pesanan getPesanan(Pelanggan pengguna)
   {
       for(Pesanan pesan : list_pesanan)
       {
            if(pesan.getPelanggan().equals(pengguna))
            {
                 return pesan;
            }
       }
       return null;
    }
   
     /**
     * hapusPesanan
     * Method untuk menghapus pesanan dari database serta memberi notifikasi penghapusan.
     * @param Pelanggan pengguna data pesanan yang akan dihapus dalam database.
     * @return true   menandakan penghapusan pesanan berhasil dilakukan.
     */
   public static boolean hapusPesanan(Pelanggan pengguna)
   {
        Pesanan pesan = getPesanan(pengguna);
        if(pesan.getPelayan()== null)
        {
            list_pesanan.remove(pesan);
            return true;
        }
    
        return false;
    }
 
   /**
     * hapusPesanan
     * Method untuk menghapus pesanan dari database serta memberi notifikasi penghapusan.
     * @param Pesanan pesan     data pesanan yang akan dihapus dalam database.
     * @return true   menandakan penghapusan pesanan berhasil dilakukan.
     */
   public static boolean hapusPesanan(Pesanan pesan)
   {
        if(pesan.getPelayan()== null)
        {
            return false;
        }
        
        list_pesanan.remove(pesan);
        return true;
   }
}
