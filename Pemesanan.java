// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        // Do your magic here

        //Menghitung harga dengan melihat jumlah tiket yang dibeli dan tahap pembelian
        double totalHarga = tiket.hitungHarga(jumlah, tahap);
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Tahap Pembelian : " + tahap);
        System.out.println("Jenis Tiket : " + tiket.jenis);
        System.out.println("Jumlah Tiket : " + jumlah);
        System.out.printf("Total Harga : Rp " + totalHarga);
    }
}
