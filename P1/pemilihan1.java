package P1;

import java.util.Scanner;

public class pemilihan1 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);

        int tugas, kuis, uts, uas;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        while (true) {
            System.out.print("Masukan Nilai Tugas: ");
            tugas = rhenza.nextInt();
            if (tugas > 100 || tugas < 0) {
                System.out.println("Nilai Tidak Valid! Input Ulang: ");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Masukan Nilai Kuis: ");
            kuis = rhenza.nextInt();
            if (kuis > 100 || kuis < 0) {
                System.out.println("Nilai Tidak Valid! Input Ulang: ");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Masukan Nilai UTS: ");
            uts = rhenza.nextInt();
            if (uts > 100 || uts < 0) {
                System.out.println("Nilai Tidak Valid! Input Ulang! ");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Masukan Nilai UAS: ");
            uas = rhenza.nextInt();
            if (uas > 100 || uas < 0) {
                System.out.println("Nilai Tidak Valid! Input Ulang: ");
            } else {
                break;
            }
        }

        double akhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        String huruf;
        if (akhir > 80) {
            huruf = "A ";
        } else if (akhir > 73) {
            huruf = "B+";
        } else if (akhir > 65) {
            huruf = "B ";
        } else if (akhir > 60) {
            huruf = "C+";
        } else if (akhir > 50) {
            huruf = "C ";
        } else if (akhir > 39) {
            huruf = "D ";
        } else {
            huruf = "E ";
        }

        String status = "";
        if (huruf.equalsIgnoreCase("D") || huruf.equalsIgnoreCase("E")) {
            status = "TIDAK LULUS";
        }else{
            status = "LULUS";
        }

        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Nilai Akhir: "+ akhir);
        System.out.println("Nilai Huruf: "+huruf);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(status);
        rhenza.close();
    }
}
