import java.util.*;

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main (String []args)
    {
        String[] benda = {"bola", "basket", "voli", "golf"};
        List<String> list1 = new ArrayList<String>();
        for (String x: benda)
        list1.add(x);
        
        String[] benda1 = {"basket", "voli"};
        List<String> list2 = new ArrayList<String>();
        for (String y: benda1)
        list2.add(y);
        
        for (int i=0; i<list1.size(); i++)
        System.out.printf("%s", list1.get(i));
        
        edit(list1,list2);
        //System.out.println();
        for (int i=0; i<list1.size(); i++)
        System.out.printf("%s", list1.get(i));
    }
    
    public static void edit (Collection<String> l1, Collection<String> l2)
    {
        Iterator<String> it = l1.iterator();
        while (it.hasNext())
        {
            if(l2.contains(it.next()))
            it.remove();
            
        }
    }
}
