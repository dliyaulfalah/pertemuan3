package pertemuan6;

public class Kubus implements Ruang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 12 * sisi;
    }

    @Override
    public double hitungLuas() {
        return 6 * sisi * sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}
