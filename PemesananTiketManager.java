package remdi_uts;

import java.util.ArrayList;

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
                System.out.println("Cetak Tiket");
                // Cetak data tiket sesuai kebutuhan
            }
        }
    }
}
