package P1;

import java.util.Scanner;

public class tugas2 {

    static Scanner rhenza = new Scanner(System.in);
    static String[][] jadwal;
    static int n;

    static void tampilMenu() {
        System.out.println("===============================");
        System.out.println("    MANAJEMEN JADWAL KULIAH    ");
        System.out.println("===============================");
        System.out.println("1. Input Data Jadwal");
        System.out.println("2. Tampilkan Semua Jadwal");
        System.out.println("3. Cari Jadwal by Hari");
        System.out.println("4. Cari Jadwal by Matkul");
        System.out.println("0. Keluar");
        System.out.print("Pilih Menu: ");
    }

    static void inputJadwal() {
        System.out.print("Masukan jumlah jadwal kuliah (n) : ");
        n = rhenza.nextInt();
        rhenza.nextLine();

        jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("    Input Jadwal ke-" + (i + 1));

            System.out.print("Nama Matkul: ");
            jadwal[i][0] = rhenza.nextLine();

            System.out.print("Ruang: ");
            jadwal[i][1] = rhenza.nextLine();

            System.out.print("Hari: ");
            jadwal[i][2] = rhenza.nextLine();

            System.out.print("Jam: ");
            jadwal[i][3] = rhenza.nextLine();
        }
        System.out.println("Data berhasil disimpan");
    }

    static void tampilSemuaJadwal() {
        if (jadwal == null || n == 0) {
            System.out.println("Belum ada jadwal");
            return;
        }
        System.out.println("===========================================");
        System.out.println("SELURUH JADWAL KULIAH");
        System.out.printf("%-3s %-25s %-10s %-10s %-10s %n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3s %-25s %-10s %-10s %-10s %n",
                    " " + (i + 1),
                    " " + jadwal[i][0],
                    " " + jadwal[i][1],
                    " " + jadwal[i][2],
                    " " + jadwal[i][3]);
        }
        System.out.println("==========================================");
    }

    static void cariJadwalbyHari() {
        if (jadwal == null || n == 0) {
            System.out.println("Belum ada jadwal");
            return;
        }

        System.out.print("Masukan hari yang dicari: ");
        String hari = rhenza.nextLine();

        boolean ditemukan = false;

        System.out.println("\nJadwal kuliah hari: ");
        System.out.printf("%-3s %-25s %-10s %-10s %-10s %n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");

        int no = 1;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-3s %-25s %-10s %-10s %-10s %n",
                        " " + no,
                        " " + jadwal[i][0],
                        " " + jadwal[i][1],
                        " " + jadwal[i][2],
                        " " + jadwal[i][3]);
                no++;
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari " + hari);
            return;
        }

    }

    static void cariJadwalbyMatkul() {
        if (jadwal == null || n == 0) {
            System.out.println("Belum ada data jadwal.");
            return;
        }

        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String mataKuliah = rhenza.nextLine();

        boolean ditemukan = false;

        System.out.println("\nHasil pencarian mata kuliah: " + mataKuliah);
        System.out.printf("%-3s %-25s %-10s %-10s %-10s %n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");

        int no = 1;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mataKuliah)) {
                System.out.printf("%-3s %-25s %-10s %-10s %-10s %n",
                        " " + no,
                        " " + jadwal[i][0],
                        " " + jadwal[i][1],
                        " " + jadwal[i][2],
                        " " + jadwal[i][3]);
                no++;
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + mataKuliah + " tidak ditemukan.");
            return;
        }
        
    }

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilMenu();
            pilihan = rhenza.nextInt();
            rhenza.nextLine();

            switch (pilihan) {
                case 1:
                    inputJadwal();
                    break;
                case 2:
                    tampilSemuaJadwal();
                    break;
                case 3:
                    cariJadwalbyHari();
                    break;
                case 4:
                    cariJadwalbyMatkul();
                    break;
                case 0:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 0);
    }
}
