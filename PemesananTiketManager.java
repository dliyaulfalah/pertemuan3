package remdi_uts;

import java.util.ArrayList;

// Kelas untuk mengelola pesanan tiket dengan polimorfisme
public class PemesananTiketManager {
    private ArrayList<Tiket> pesananTiketList = new ArrayList<>();

    public void tambahPesanan(Tiket tiket) {
        pesananTiketList.add(tiket);
    }

    public void cetakSemuaTiket() {
        if (pesananTiketList.isEmpty()) {
            System.out.println("Belum ada data pesanan tiket.");
        } else {
            for (Tiket pesanan : pesananTiketList) {
                pesanan.cetakTiket();
            }
        }
    }
}

