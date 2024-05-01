import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Do your magic here
        
        // Untuk menginputkan nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = scanner.nextLine();

        // Memilih tahap pembelian
        System.out.println("\nPilih tahap pembelian :");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2) : ");
        int tahapPembelian = scanner.nextInt();

        // Memilih jenis tiket berdasarkan tahap pembelian
        System.out.println("\nPilih jenis tiket : ");
        if (tahapPembelian == 1) {
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2) : ");

        } else if (tahapPembelian == 2) {
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3) : ");

        } else {
            System.out.println("Input tidak valid!");
        }

        int jenisTiket = scanner.nextInt();

        // Untuk menginputkan jumlah tiket yang dibeli
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli : ");
        int jumlahTiket = scanner.nextInt();

        // Membedakan pesanan sesuai inputan pembeli
        Pemesanan pesanan;
        if (tahapPembelian == 1) {
            pesanan = new Pemesanan(nama, "Presale", new VIP(), jumlahTiket);
        
        } else if (tahapPembelian == 2) {

            switch (jenisTiket) {

                case 1:
                    pesanan = new Pemesanan(nama, "Reguler", new Festival(), jumlahTiket);
                    break;

                case 2:
                    pesanan = new Pemesanan(nama, "Reguler", new VIP(), jumlahTiket);
                    break;

                case 3:
                    pesanan = new Pemesanan(nama, "Reguler", new VVIP(), jumlahTiket);
                    break;

                default:
                    System.out.println("Input tidak valid!");
                    return;
            }

        } else {
            System.out.println("Input tidak valid!");
            return;
        }

        // Mencetak nota pemesanan
        pesanan.cetakNota();

        scanner.close();
    }

}
