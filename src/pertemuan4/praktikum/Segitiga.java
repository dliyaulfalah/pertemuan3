package pertemuan4.praktikum;


// Class Segitiga sebagai superclass
public  class Segitiga {
    public double alas;
    public double tinggi;

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
        // Untuk kasus segitiga, Anda perlu mengetahui sisi-sisinya.
        // Dalam contoh ini, saya anggap membuat contoh segitiga sembarang.
        // Anda mungkin perlu menyesuaikan sesuai kebutuhan.
        double sisiMiring = Math.sqrt(alas*alas + tinggi*tinggi);
        return alas + tinggi + sisiMiring;
    }
}

