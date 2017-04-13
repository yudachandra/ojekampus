import java.util.*;

/**
 * Write a description of class set here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class set
{
    // instance variables - replace the example below with your own
    public static void main (String []args)
    {
        String[] nanda = {"dosa", "lemak", "kolesterol", "lemak"};
        List<String> list = Arrays.asList(nanda);
        System.out.printf("%s", list);
        
        Set<String> lala = new HashSet<String>(list);
        System.out.printf("%s", lala);
    }
    
    
}
