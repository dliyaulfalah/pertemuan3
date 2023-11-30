package remdi_uts;


public class Tiket {
    private String bookingID;
    private String nik;
    private String nama;
    private String jenis_kelamin;
    private String tglBerangkat;
    private String tglKembali;
    private String kotaAsal;

    public Tiket(String bookingID, String nik, String nama, String jenis_kelamin,
                 String tglBerangkat, String tglKembali, String kotaAsal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tglBerangkat = tglBerangkat;
        this.tglKembali = tglKembali;
        this.kotaAsal = kotaAsal;
    }

    public void entriData() {
    }

    // Getter

    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }
}
