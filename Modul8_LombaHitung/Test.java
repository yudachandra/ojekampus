package Modul7_CS;

import java.util.*;


/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
   private static int[] arrayDelay = new int[3];
    
   /**
    * Constructor for objects of class Test
    */
   public Test()
   {
       // initialise instance variables
   }
   
   public static int random()
   {
        Random rand = new Random();
        return rand.nextInt(99)+1;
   }
  
   public static int[] sortDelay(int[] arr){
        //Algoritma yang digunakan adalah selection sort.
        for (int i=0; i<arr.length-1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
    
   public static void main(String args[]) 
    {
       int i;
       for(i=0;i<3;i++)
        {
            arrayDelay[i] = random();
        }
       arrayDelay = sortDelay(arrayDelay);
       LombaHitung R1 = new LombaHitung( "Tomi", arrayDelay[2]);
       R1.start();
     
       LombaHitung R2 = new LombaHitung( "Tomo", arrayDelay[1]);
       R2.start();
     
       LombaHitung R3 = new LombaHitung( "Toma", arrayDelay[0]);
       R3.start();
   } 
}
