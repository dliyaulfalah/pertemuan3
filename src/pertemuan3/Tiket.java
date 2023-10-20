package pertemuan3;
import java.util.Scanner;

public class Tiket {
    private String username;
    private String password;
    private int jumlahKamar;
    private double hargaKamar;
    private String namaPesawat;
    private int jumlahPenumpang;
    private double hargaTiketPesawat;
    private String tujuan;

    public Tiket() {
        this.username = null;
        this.password = null;
    }

    public void setLoginCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void inputDataTransaksi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah kamar: ");
        jumlahKamar = scanner.nextInt();

        System.out.print("Harga per kamar: ");
        hargaKamar = scanner.nextDouble();

        System.out.print("Nama pesawat: ");
        namaPesawat = scanner.next();

        System.out.print("Jumlah penumpang: ");
        jumlahPenumpang = scanner.nextInt();

        System.out.print("Harga tiket pesawat: ");
        hargaTiketPesawat = scanner.nextDouble();

        System.out.print("Tujuan: ");
        tujuan = scanner.next();
    }

    public void lihatDataTiket() {
        if (jumlahKamar != 0) {
            double totalBiayaKamar = (hargaKamar * jumlahKamar) * 0.55; // Diskon 45%
            double hargaTiket = hargaTiketPesawat * jumlahPenumpang;
            double total = hargaTiket + (jumlahPenumpang * 29000); // Asuransi 29000/penumpang

            System.out.println("\n--- Data Tiket ---");
            System.out.println("Jumlah Kamar: " + jumlahKamar);
            System.out.println("Harga Kamar: " + hargaKamar);
            System.out.println("Nama Pesawat: " + namaPesawat);
            System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
            System.out.println("Harga Tiket Pesawat: " + hargaTiketPesawat);
            System.out.println("Tujuan: " + tujuan);
            System.out.println("Total Biaya Kamar: " + totalBiayaKamar);
            System.out.println("Harga Tiket: " + hargaTiket);
            System.out.println("Total: " + total);
        } else {
            System.out.println("Belum ada data tiket.");
        }
    }
}


