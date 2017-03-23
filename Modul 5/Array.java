/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class Array
{
    // instance variables - replace the example below with your own
    private static ArrayList<Integer> listInt = new ArrayList<>();
    private static int[] arrayInt = new int[1000];
    

    /**
     * Constructor for objects of class Array
     */
    public Array()
    {
        // initialise instance variables
        
    }
    
     public static void main(String[] args) 
    {
        int i;
        inputArrayInt();        
        inputListInt();
        long startTime = System.currentTimeMillis();
        arrayInt = sortArray(arrayInt);
        
        System.out.println("Sort ArrayInt:");
        System.out.println("");
        for(i = 0; i<arrayInt.length;i++){
        System.out.print(" "+arrayInt[i]);
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println();
        System.out.println("    Waktu yang dibutuhkan untuk memproses ArrayInt  :   " + elapsedTime+" ms");
        System.out.println("========================================");
        Collections.sort(listInt);
        System.out.println("");
        System.out.println("Sort ArrayList:");
        startTime = System.currentTimeMillis();
        System.out.println(listInt);
        stopTime = System.currentTimeMillis();
        long elapsedTime1 = stopTime - startTime;
        System.out.println("    Waktu yang dibutuhkan untuk memproses ArrayList :   " + elapsedTime1+" ms");
    }
    
    public static void inputListInt(){
     File file = new File("E:\\listArray.txt");
        int i=0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                i = sc.nextInt();
                listInt.add(i);
            }
        
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void inputArrayInt(){
     File file = new File ("D:/Kuliah/Semester 6/OOP/Modul 5/OOP_2016-2017_CS_5_Arrays (1).txt");
        int i=0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                arrayInt[i] = sc.nextInt();
                listInt.add(arrayInt[i]);
                i++;
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /** Tugas 4
     * 
     */
    public static int[] sortArray(int[] array)
    {
        Arrays.sort(array);
        return array;
    }
    
    //Algoritma quicksort
    public static int[] sortArray(int[] arr, int kecil, int besar) {
        if (arr == null || arr.length == 0)
            return arr;
 
        if (kecil >= besar)
            return arr;
 
        // pick the tengah
        int nilai_tengah = kecil + (besar - kecil) / 2;
        int tengah = arr[nilai_tengah];
 
        // make left < tengah and right > tengah
        int i = kecil, j = besar;
        while (i <= j) {
            while (arr[i] < tengah) {
                i++;
            }
 
            while (arr[j] > tengah) {
                j--;
            }
 
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
 
        // recursively sort two sub parts
        if (kecil < j)
            sortArray(arr, kecil, j);
 
        if (besar > i)
            sortArray(arr, i, besar);
    
        return arr;
    }
    //Class dan Method sorting Tugas 1

    public static ArrayList<Integer> sortArrayList(ArrayList<Integer> array){
        //Algoritma yang digunakan adalah selection sort.
        int[] arr = new int[array.size()];
        for(int x = 0; x<arr.length;x++){
           arr[x] = array.get(x).intValue();
        }
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        
        array.clear();
        for(int x = 0; x<arr.length;x++){
           array.add(arr[x]);
        }
        return array;
    }
}