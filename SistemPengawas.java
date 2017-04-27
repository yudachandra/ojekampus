
/**
 * Write a description of class SistemPengawas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SistemPengawas implements Runnable
{
    private Thread t;
    private String threadName;
    private boolean program_run;
    private int waktu_cek;
    
    /**
     * Constructor for objects of class SistemPengawas
     */
    public SistemPengawas(String name, int waktu_cek)
    {
        // initialise instance variables
        program_run=true;
        this.threadName = threadName;
        this.waktu_cek = waktu_cek;
        System.out.println("Creating" + threadName);
    }

    public void run()
    {
        System.out.println("Running" + threadName);
        while(program_run==true)
            {
                try 
                {
                   Thread.sleep(waktu_cek); 
                   Administrasi.jalankanSistemPenugas();
                }
                catch (InterruptedException e) 
                {
                    System.out.println("Thread " +  threadName + " interrupted.");
                }
                catch (NullPointerException e)
                {
                    exit();
                }
            }
        System.out.println("Thread " +  threadName + " exiting.");
    }
    
    public void start()
    {
      System.out.println("Starting " +  threadName );
      if (t == null) 
      {
         t = new Thread (this);
         t.start ();
      }
    }
    
    public void join() throws InterruptedException
    {
        t.join();
    }
    
    public void exit()
    {
        program_run=false;
    }
}
