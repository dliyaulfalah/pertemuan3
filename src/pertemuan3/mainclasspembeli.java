//package pertemuan3;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class MainClassPembeli {
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        pembeli member = null; // Deklarasi awal variabel
//        pembeli transaksi = null; // Deklarasi awal variabel
//
//        String namabrg, namape, beli, alamat, telp;
//        int usia, jml, harga;
//
//        try {
//            do {
//                System.out.println("---- Maret April ----");
//                System.out.println("1. Pendaftaran");
//                System.out.println("2. Transaksi");
//                System.out.println("3. Keluar Aplikasi");
//                System.out.print("Pilih menu : ");
//                int menu = Integer.parseInt(br.readLine());
//
//                switch (menu) {
//                    case 1:
//                        System.out.println("--- Daftar Member ---");
//                        System.out.print("Nama : ");
//                        namape = br.readLine();
//                        System.out.print("Alamat : ");
//                        alamat = br.readLine();
//                        System.out.print("No Telp : ");
//                        telp = br.readLine();
//                        System.out.print("Usia : ");
//                        usia = Integer.parseInt(br.readLine());
//
//                        member = new pembeli(namape, alamat, usia, telp);
//                        break;
//
//                    case 2:
//                        System.out.println("--- Transaksi ---");
//                        System.out.print("Nama Barang : ");
//                        namabrg = br.readLine();
//                        System.out.print("Harga Barang : ");
//                        harga = Integer.parseInt(br.readLine());
//                        System.out.print("Jumlah Beli : ");
//                        jml = Integer.parseInt(br.readLine());
//
//                        transaksi = new pembeli(namabrg, jml, harga);
//
//                        System.out.println("Total Belanja : " + transaksi.getTotal());
//
//                        System.out.print("Member? (y/n): ");
//                        String jawab = br.readLine();
//                        if (jawab.equalsIgnoreCase("y")) {
//                            System.out.print("Masukkan No Telp : ");
//                            telp = br.readLine();
//
//                            // Cek apakah no telp sama dengan yang didaftarkan atau tidak
//                            if (telp.equalsIgnoreCase(member.getNoTelp())) {
//                                System.out.println("No Telp yang didaftarkan : " + member.getNoTelp());
//                                System.out.println("Poin Anda adalah : " + transaksi.getMemberPoin());
//                            } else {
//                                System.out.println("Mohon maaf, No Telp tidak terdaftar");
//                            }
//
//                        } else {
//                            // Non-member transaksi
//                        }
//                        break;
//
//                    case 3:
//                        // Keluar dari program
//                        System.exit(0);
//
//                    default:
//                        System.out.println("Pilihan tidak valid");
//                        break;
//                }
//
//            } while (true);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
