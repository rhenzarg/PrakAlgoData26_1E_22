package jobsheet9;

import java.util.Scanner;

public class DemoSurat28 {
    public static void main(String[] args) {
        StackSurat28 stack = new StackSurat28(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat28 s = new Surat28(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat28 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat:");
                        proses.tampil();
                    }
                    break;

                case 3:
                    Surat28 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilih != 5);
    }
}
