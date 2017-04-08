
/**
 * Write a description of class TipeLayanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum TipeLayanan 
{
    AntarBarang("Antar Barang"), AntarOrang("Antar Orang"), BeliBarang("Beli Barang");
    
    private String deskripsi;
    
    TipeLayanan (String deskripsi)
    {
        this.deskripsi=deskripsi;
    }
    
    public String getTipeLayanan()
    {
        return deskripsi;
    }
}
