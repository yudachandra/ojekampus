
/**
 * Write a description of class array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class array
{
    public static void main (String []args)
    {
        int [] amiasu= {11, 12, 13, 14, 15};
        tambah(amiasu);
        for (int i: amiasu)
        {
        System.out.println(i);
        }
    }
    
    public static void tambah (int x[])
    {
        for (int i=0; i<x.length; i++)
            {
                x[i]+=5;
            }
    }
    
}
