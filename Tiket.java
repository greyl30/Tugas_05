// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    //Do your magic here

    //Untuk menyimpan jenis tiket dan harga tiket
    protected String jenis;
    protected double hargaReguler;
    protected double hargaPresale;

    public Tiket(String jenis, double hargaReguler, double hargaPresale) {
        this.jenis = jenis;
        this.hargaReguler = hargaReguler;
        this.hargaPresale = hargaPresale;
    }

    //Untuk menghitung harga total tiket
    public double hitungHarga(double jumlah, String tahap) {
        if (tahap.equalsIgnoreCase("presale")) {
            //perhitungan untuk harga tiket presale
            return (double) (jumlah * hargaPresale);

        } else {
            //Perhitungan untuk harga tiket reguler
            return jumlah * hargaReguler;
        }
    }
}