package remdi_uts;

import java.util.Scanner;

// Kelas utama aplikasi
public class AplikasiPemesananTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PemesananTiketManager pemesananTiketManager = new PemesananTiketManager();

        while (true) {
            System.out.println("\nMenu Aplikasi");
            System.out.println("1. Entri Data Pesanan Tiket");
            System.out.println("2. Cetak Tiket");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu (1/2/3): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    // Entri Data Pesanan Tiket
                    Tiket pesananCitilink = new Citilink("", "", 0);
                    pesananCitilink.entriData();
                    pemesananTiketManager.tambahPesanan(pesananCitilink);
                    break;
                case 2:
                    // Cetak Tiket
                    pemesananTiketManager.cetakSemuaTiket();
                    break;
                case 3:
                    // Keluar dari Aplikasi
                    System.out.println("Terima kasih telah menggunakan jasa kami!.");
                    System.exit(0);
                default:
                    System.out.println("Anda menekan nomor selain yang ada di menu. Silakan pilih menu yang benar.");
            }
        }
    }
}

