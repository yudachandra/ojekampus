    import java.util.*;
    import java.io.*;
    
/**
 * Write a description of class OOP here.
 * 
 * @author Yuda Chandra Wiguna
 * @version 23 Maret 2017
 */
public class OOP
{
    // instance variables - replace the example below with your own
    private static ArrayList<Mahasiswa> siswa = new ArrayList<>();
    /**
     * Constructor for objects of class OOP
     */
    public OOP()
    {
        // initialise instance variables
        System.out.println("Masukan nama lalu tekan enter, kemudian masukan nilai lalu tekan enter ");
        Scanner scanner = new Scanner(System.in);
        String inputString = " ";
        boolean cekInput=false;
        int inputInt=0;
        while(true)
        {
            inputString = scanner.nextLine();
            if(inputString.equals("q"))//Input q untuk melihat hasil data
            {
                break;
            }
            inputInt = scanner.nextInt();
            scanner.nextLine();
            siswa.add(new Mahasiswa(inputString,inputInt));
        }
    }

    /**
     * Method main
     *
     * @param args {} untuk memulai program main pada class ini
     */
    public static void main(String[] args) 
    {
        OOP oop1 = new OOP();
        System.out.println("Sebelum di sort");
        System.out.println(siswa);
        Collections.sort(siswa);
        System.out.println("Sesudah di sort");
        System.out.println(siswa);
    }
}
