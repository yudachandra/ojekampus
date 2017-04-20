package Modul7_CS;

public class LombaHitung implements Runnable {
   private Thread t;
   private String tName;
   private int jeda;
   
   LombaHitung(String name, int jeda) 
   {
      tName = name;
      this.jeda = jeda;
      System.out.println(tName +" hadir" );
   }
   
   public void run() {
      System.out.println(tName + " mulai menghitung " );
      try 
      {
         for(int i=1; i<24; i++) 
         {
            System.out.println("Kontestan " + tName + " menghitung,"  + i);
            Thread.sleep(jeda);
         }
      }
      catch (InterruptedException e) 
      {
         System.out.println("Thread " +  tName + " interrupted.");
      }
      System.out.println("Kontestan " + tName + " selesai menghitung,");
   }
   
   public void start () 
   {
      System.out.println(tName +" bersiap" );
      if (t == null) 
      {
         t = new Thread (this, tName);
         t.start ();
      }
      
   }
}