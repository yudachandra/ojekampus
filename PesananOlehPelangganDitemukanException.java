
/**
 * Write a description of class PesananOlehPelangganDitemukanException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananOlehPelangganDitemukanException extends Exception
{
    // instance variables - replace the example below with your own
    private Pelanggan pelanggan_error;
    /**
     * Constructor for objects of class PesananOlehPelangganDitemukanException
     */
    public PesananOlehPelangganDitemukanException(Pelanggan pelanggan_input)
    {
        super("Pesanan oleh");
        this.pelanggan_error=pelanggan_input;
    }

    public String getMessage()
    {
        return super.getMessage() + pelanggan_error.getNama() + "Tidak Ditemukan";
    }
}
