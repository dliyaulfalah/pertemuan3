package remdi_uts;

import java.util.Scanner;

// Implementasi antarmuka Tiket untuk Citilink
public class Citilink implements Tiket {
    private String kotaKeberangkatan;
    private String tujuan;
    private int harga;

    // Konstruktor
    public Citilink(String kotaKeberangkatan, String tujuan, int harga) {
        this.kotaKeberangkatan = kotaKeberangkatan;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    // Implementasi dari antarmuka Tiket
    public void entriData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entri Data Pesanan Tiket Citilink");

        System.out.print("Kota Keberangkatan (Surabaya/Jakarta): ");
        this.kotaKeberangkatan = scanner.nextLine();

        System.out.print("Tujuan (Bali/Lombok/Jakarta/Yogyakarta/Balikpapan/Makassar): ");
        this.tujuan = scanner.nextLine();

        System.out.print("Harga: ");
        this.harga = scanner.nextInt();
    }

    public void cetakTiket() {
        System.out.println("\nCetak Tiket Citilink");
        System.out.println("Kota Keberangkatan: " + kotaKeberangkatan);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga: " + harga);
    }
}

