
/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusOjek
{
    Antar("Mengantar"), Idle("Idle"), Jemput("Menjemput");
    
    private String deskripsi;
    
    StatusOjek (String deskripsi)
    {
        this.deskripsi=deskripsi;
    }
    
    public String toString()
    {
        return "";
    }
    
}
