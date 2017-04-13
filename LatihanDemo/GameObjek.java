
/**
 * Abstract class GameObjek - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class GameObjek
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public static void main (String []args)
    {
        GameObjek Play = new Player();
        GameObjek CPU = new CPU();
        GameObjek yuda[]= new GameObjek[2];
        
        yuda[0] = new Player();
        yuda[1] = new CPU();
        for (GameObjek g : yuda)
            g.buat();
    }
    
    public abstract void buat();
    
    
}
