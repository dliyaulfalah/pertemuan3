package remdi_uts;

public class Citilink {
    private int jumlahPenumpang;
    private String kotaTujuan;
    private String noPesawat;
    private String noKursi;
    private int harga;

    public Citilink(String bookingID, String nik, String nama, String jenis_kelamin,
                    String tglBerangkat, String tglKembali, String kotaAsal,
                    int jumlahPenumpang, String kotaTujuan, String noPesawat, String noKursi) {
        // Implementasi konstruktor Citilink yang memanggil konstruktor Tiket
    }

    // Getter


    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }

    // Metode untuk mendapatkan harga tiket
    public int getHarga() {
        // Implementasi logika perhitungan harga sesuai kota asal dan tujuan
        return 0;
    }

    // Metode untuk mendapatkan total harga tiket
    public int getTotal() {
        // Implementasi logika perhitungan total harga
        return 0;
    }
}
