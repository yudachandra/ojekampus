import java.util.ArrayList;

/**
 * OjeKampus merupakan main class dari project ojekampus yang terdapat method main.
 * Kelas utama untuk menjalankan program main
 * @author Yuda Chandra Wiguna 
 * @version 4 March 2017
 */
public class DatabaseUser
{
   //Instance Variables
   private static int id_ojek_terakhir=1;
   private static int id_pelanggan_terakhir=1;
   private static ArrayList<Ojek> ojek_database = new ArrayList<>();
   private static ArrayList<Pelanggan> pelanggan_database = new ArrayList<>();
   private static ArrayList<User> user_database = new ArrayList<User>();
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
    public static boolean addOjek(Ojek baru)
   {
        for(Pelanggan id_pelanggan_terakhir : pelanggan_database){
            if(id_pelanggan_terakhir.equals(baru)){
                System.out.println("Penambahan pelanggan dalam database gagal");
                return false;
            }
        }
        
        for(Ojek data_ojek : ojek_database)
        {
            if(data_ojek.equals(baru))
            {
                System.out.println("Penambahan ojek dalam database gagal");
                return false;
            }
        }
        ojek_database.add(baru);
        System.out.println("Penambahan ojek dalam database berhasil");
        return true;
    }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static boolean addPelanggan(Pelanggan baru)
   {
       for(Pelanggan id_pelanggan_terakhir : pelanggan_database){
            if(id_pelanggan_terakhir.equals(baru)){
                System.out.println("Penambahan pelanggan dalam database gagal");
                return false;
            }
        }
       
       for(Pelanggan data_pengguna : pelanggan_database){
            if(data_pengguna.equals(baru)){
                System.out.println("Penambahan pelanggan dalam database gagal");
                return false;
            }
        }
        pelanggan_database.add(baru);
        System.out.println("Penambahan pelanggan dalam database berhasil");
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
   
   public static ArrayList<Ojek> getOjekDatabase()
   {
       return ojek_database;
   }
    
   public static ArrayList<Pelanggan> getPelangganDatabase()
   {
       return pelanggan_database;
   }
    
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return ojek_database    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static Ojek getUserOjek(int id)
   {
        for(Ojek data_ojek : ojek_database)
        {
            if(data_ojek.getID() == id)
            {
                 return data_ojek;
            }
        }
        return null;
    }

   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return pelanggan_database    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static Pelanggan getUserPelanggan(int id)
   {
       for(Pelanggan data_pelanggan : pelanggan_database)
       {
            if(data_pelanggan.getID() == id)
            {
                 return data_pelanggan;
            }
        }
        return null;
    }
   
   public void printData(Ojek ojek_database)
    {
        System.out.println("==================== ");
    }
    
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static boolean removeOjek(int id)
   {
        Ojek data_ojek = getUserOjek(id);
        if(data_ojek == null){
            System.out.println("ID ojek tidak terdaftar, penghapusan batal");
            return false;
        }
        ojek_database.remove(data_ojek);
        System.out.println("Penghapusan Ojek dengan ID " + id + " berhasil dilakukan");
        return true;
    }
   
   /**
     * Method untuk mengecek boolean value dari pelanggan
     * @return true    bila nilai true maka sistem akan print string yang telah di deklarasi
     */
   public static boolean removePelanggan(int id)
   {
        Pelanggan data_pelanggan = getUserPelanggan(id);
        if(data_pelanggan == null){
            System.out.println("ID Pelanggan tidak terdaftar, penghapusan batal");
            return false;
        }
        pelanggan_database.remove(data_pelanggan);
        System.out.println("Penghapusan Pelanggan dengan ID " + id + " berhasil dilakukan");
        return true;
    }
}
