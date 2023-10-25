package pertemuan4.praktikum;

// Class Main untuk menampilkan hasil perhitungan
public class Main {
    public static void main(String[] args) {
        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(5, 8);

        // Menghitung dan menampilkan luas segitiga
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());

        // Menghitung dan menampilkan keliling segitiga
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());

        // Membuat objek kerucut
        Kerucut kerucut = new Kerucut(4, 10, 8, 15);

        // Menghitung dan menampilkan volume kerucut
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
    }
}
