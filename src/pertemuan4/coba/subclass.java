package pertemuan4.coba;

public class subclass extends superclass {
    public  int usia;

    public subclass(String nama, String keterangan, int usia) {
        super(nama, keterangan);
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getKeterangan() {
        return super.getKeterangan();
    }
}
