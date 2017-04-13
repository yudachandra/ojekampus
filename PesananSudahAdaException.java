
/**
 * Write a description of class PesananSudahAdaException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananSudahAdaException extends Exception
{
    // instance variables - replace the example below with your own
    private Pesanan pesanan_error;

    /**
     * Constructor for objects of class PesananSudahAdaException
     */
    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        super("Pelanggan dengan nama");
        this.pesanan_error=pesanan_input;
    }

    public String getMessage()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + "Sudah Melakukan Pemesanan Dengan Tipe Layanan" + pesanan_error.getTipeLayanan();
    }
}
