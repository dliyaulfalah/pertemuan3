package pertemuan4.praktikum;


// Class Segitiga sebagai superclass
public class Segitiga {
    protected double alas;
    protected double tinggi;

    // Constructor untuk inisialisasi alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas*alas + tinggi*tinggi);
        return alas + tinggi + sisiMiring;
    }
}


