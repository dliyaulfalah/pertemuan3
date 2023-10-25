package pertemuan4.coba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclasssuperclass {
    public static void main(String[] args) throws IOException {
        subclass subclass = new subclass("","", 0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        subclass s = new subclass("","",0);

        System.out.println("----dapat----");
        System.out.print("Masukkan nama: ");
        String nama = br.readLine();
        System.out.print("Masukkan keterangan: ");
        String keterangan = br.readLine();
        System.out.print("Masukkan usia: ");
        int usia = Integer.parseInt(br.readLine());

        //masukkan data ke objek constructor
        s = new subclass(nama, keterangan, usia);

        System.out.println("Nama: " + s.getNama());
        System.out.println("keterangan: " + s.getKeterangan());
        System.out.println("usia: " + s.getUsia());

    }
}
