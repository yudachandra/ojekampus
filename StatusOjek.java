
/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author Yuda Chandra W
 * @version 8 April 2017
 */
public enum StatusOjek
{
    Antar("Mengantar"), Idle("Idle"), Jemput("Menjemput");
    
    private String deskripsi;
    
    StatusOjek (String deskripsi)
    {
        this.deskripsi=deskripsi;
    }
    
    public String getIDStatus()
    {
        return deskripsi;
    }
}
