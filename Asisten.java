
/**
 * Write a description of class Asisten here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asisten
{
    private String name;
    private Tahun year;
    
    public Asisten (String name, Tahun year)
    {
        this.name=name;
        this.year=year;
    }
    
    public String toString()
    {
        return String.format("Nama saya adalah %s, Ultah %s", name, year);
        
    }
}
