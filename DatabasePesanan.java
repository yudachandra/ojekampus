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
   public static boolean addPesanan(Pesanan pesan) throws PesananSudahAdaException
   {
       Pelanggan pengguna = pesan.getPelanggan();
       if(getPesanan(pengguna)==null)
       {
            System.out.println("Pesanan berhasil dilakukan");
            list_pesanan.add(pesan);
            return true;
       }
       System.out.println("Pesanan gagal");
       throw new PesananSudahAdaException(pesan);
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
   public static boolean hapusPesanan(Pesanan pesan) throws PesananTidakDitemukanException
   
   {
        //Pesanan pesan = getPesanan(pengguna);
        if(pesan.getPelayan()== null)
        {
            throw new PesananTidakDitemukanException(pesan);
        }
        list_pesanan.remove(pesan);
        return false;
    }
 
   /**
     * hapusPesanan
     * Method untuk menghapus pesanan dari database serta memberi notifikasi penghapusan.
     * @param Pesanan pesan     data pesanan yang akan dihapus dalam database.
     * @return true   menandakan penghapusan pesanan berhasil dilakukan.
     */
   public static boolean hapusPesanan(Pelanggan pengguna) throws PesananOlehPelangganTidakDitemukanException
   {
       Pesanan pesan = getPesanan(pengguna);
       if(pesan.getPelayan()== null)
        {
            list_pesanan.remove(pesan);
            return true;
        }
       throw new PesananOlehPelangganTidakDitemukanException(pengguna);
   }
}
