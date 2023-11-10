package pertemuan4.praktikum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// Class Main untuk menampilkan hasil perhitungan
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Meminta pengguna untuk memasukkan nilai segitiga
            System.out.print("Masukkan alas segitiga: ");
            double alasSegitiga = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggiSegitiga = Double.parseDouble(reader.readLine());

            // Membuat objek segitiga
            Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);

            // Menghitung dan menampilkan luas segitiga
            System.out.println("Luas Segitiga: " + segitiga.hitungLuas());

            // Menghitung dan menampilkan keliling segitiga
            System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());

            // Meminta pengguna untuk memasukkan nilai kerucut
            System.out.print("Masukkan jari-jari kerucut: ");
            double jariJariKerucut = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan tinggi kerucut: ");
            double tinggiKerucut = Double.parseDouble(reader.readLine());

            // Membuat objek kerucut
            Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut, alasSegitiga, tinggiSegitiga);

            // Menghitung dan menampilkan volume kerucut
            System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka.");
        }
    }
}