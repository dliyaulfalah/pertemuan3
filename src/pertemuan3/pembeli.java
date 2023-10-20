package pertemuan3;

public class pembeli {
    // Atribut
    private String namaPembeli, alamat, namaBarang, noTelp;
    private int usia, jumlah, total, harga, poin;

    // Constructor
    // Constructor untuk member
    public pembeli(String nama, String alamat, int usia, String telp) {
        namaPembeli = nama;
        this.alamat = alamat;
        this.usia = usia;
        noTelp = telp;
    }

    // Constructor untuk non member = transaksi
    public pembeli(String namaBarang, int jml, int harga) {
        this.namaBarang = namaBarang;
        jumlah = jml;
        this.harga = harga;
        total = harga * jml;
    }

    // Method
    // Getter
    public String getNamaPembeli() {
        return this.namaPembeli;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public int getUsia() {
        return this.usia;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public int getHarga() {
        return this.harga;
    }

    public int getTotal() {
        return this.total;
    }

    // Method tambahan
    // Dapat poin setiap:
    // Min belanja 50rb --> poin 10
    // Min belanja 100rb --> poin 20
    public int getMemberPoin() {
        if (getTotal() >= 100000) {
            poin = 20;
        } else if (getTotal() >= 50000) {
            poin = 10;
        }
        return poin;
    }
}

