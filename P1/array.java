package P1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);
        int jmlMatkul = 8;
        String matkul[] = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical thinking dan problem solving",
                "Matematika Dasar",
                "Bahasa Inggris 1",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja",
        };

        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double[] nilai = new double[jmlMatkul];
        String[] huruf = new String[jmlMatkul];
        double[] setara = new double[jmlMatkul];
        double totalBobot = 0;
        int totalsks = 0;

        System.out.println("=====================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================================");

        for (int i = 0; i < matkul.length; i++) {
            int n;
            while (true) {
                System.out.print("Masukan nilai untuk MK " + matkul[i] + ": ");
                n = rhenza.nextInt();
                if (n > 100 || n < 0) {
                    System.out.println("Nilai Tidak Valid! Input Ulang! ");
                } else {
                    break;
                }
            }

            nilai[i] = n;

            if (n > 80) {
                huruf[i] = "A ";
            } else if (n > 73) {
                huruf[i] = "B+";
            } else if (n > 65) {
                huruf[i] = "B ";
            } else if (n > 60) {
                huruf[i] = "C+";
            } else if (n > 50) {
                huruf[i] = "C ";
            } else if (n > 39) {
                huruf[i] = "D ";
            } else {
                huruf[i] = "E ";
            }

            if (n > 80) {
                setara[i] = 4.0;
            } else if (n > 73) {
                setara[i] = 3.5;
            } else if (n > 65) {
                setara[i] = 3.0;
            } else if (n > 60) {
                setara[i] = 2.5;
            } else if (n > 50) {
                setara[i] = 2;
            } else if (n > 39) {
                setara[i] = 1;
            } else {
                setara[i] = 0;
            }

            totalBobot += setara[i] * sks[i];
            totalsks += sks[i];
        }
        double ip = totalBobot / totalsks;

        System.out.println("==============================");
        System.out.println("Hasl Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n","Mata Kuliah","Nilai Angka","Nilai Huruf","Boot Nilai");
        for (int j = 0; j < jmlMatkul; j++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", matkul[j],nilai[j],huruf[j],setara[j]);
        }
        System.out.println("=============================");
        System.out.println("IP: " +ip);
        rhenza.close();
    }

}
