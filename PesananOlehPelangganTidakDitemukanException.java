
/**
 * Write a description of class PesananOlehPelangganDitemukanException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananOlehPelangganTidakDitemukanException extends Exception
{
    // instance variables - replace the example below with your own
    private Pelanggan pelanggan_error;
    /**
     * Constructor for objects of class PesananOlehPelangganDitemukanException
     */
    public PesananOlehPelangganTidakDitemukanException(Pelanggan pelanggan_input)
    {
        super("\nPesanan oleh : ");
        this.pelanggan_error=pelanggan_input;
    }

    public String getMessage()
    {
        return super.getMessage() + pelanggan_error.getNama() + ". Tidak Ditemukan";
    }
}
