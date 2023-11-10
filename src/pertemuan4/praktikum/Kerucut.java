package pertemuan4.praktikum;

// Class Kerucut sebagai subclass dari Segitiga
public class Kerucut extends Segitiga {
    private double jariJari;
    private double tinggiKerucut;

    // Constructor untuk inisialisasi jari-jari dan tinggi kerucut
    public Kerucut(double jariJari, double tinggiKerucut, double alas, double tinggi) {
        super(alas, tinggi);
        this.jariJari = jariJari;
        this.tinggiKerucut = tinggiKerucut;
    }

    // Method untuk menghitung volume kerucut
    public double hitungVolume() {
        return (1.0/3.0) * Math.PI * jariJari * jariJari * tinggiKerucut;
    }
}