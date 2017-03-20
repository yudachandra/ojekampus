
/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
public class DatabaseUser
{
  //Instance Variables
   private static Pelanggan pelanggan_database;
   private static Ojek ojek_database;
   private static int id_ojek_terakhir=1;
   private static int id_pelanggan_terakhir=1;
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static boolean addPelanggan(Pelanggan baru)
   {
       pelanggan_database = baru;         
       System.out.println("Penambahan Pelanggan Berhasil");

       return true;
   }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static boolean removePelanggan(int id)
   {
       pelanggan_database=null;
       return true;
   }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
    public static boolean addOjek(Ojek baru)
   {
       ojek_database = baru;
       System.out.println("Penambahan Ojek Berhasil");

       return true;
   }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static boolean removeOjek(int id)
   {
       ojek_database=null;
       return true;
   }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return id_ojek_terakhir    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static int getIDOjekTerakhir()
   {
       return id_ojek_terakhir;
   }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return id_pelanggan_terakhir    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static int getIDPelangganTerakhir()
   {
       return id_pelanggan_terakhir;
   }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return ojek_database    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static Ojek getUserOjek(int id)
   {
       return ojek_database;
   }

   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return pelanggan_database    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static Pelanggan getUserPelanggan()
   {
       return pelanggan_database;
   }
   
   public void printData(Ojek ojek_database)
    {
        System.out.println("==================== ");
    }
}
