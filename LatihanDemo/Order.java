
/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Order
     */
    public Order()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main (String []args)
    {
        Bakso baso= new Bakso();
        Pangsit pangsit = new Pangsit();
        Makanan.makan();
        
        Makanan yuda[] = new Makanan[3];
        
        yuda[0]= new Pangsit();
        yuda[1]= new Bakso();
        
        for (int i=0; i<=yuda.length; i++)
        {
            yuda[i].makan();
        }
        
        Gendut aqsho = new Gendut();
        Makanan makanan1 = new Makanan();
        
        
        Gendut.eat(makanan1);
    }
    
}
