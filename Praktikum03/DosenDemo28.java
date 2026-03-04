package Praktikum03;

import java.util.Scanner;

public class DosenDemo28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);

        System.out.print("Masukan jumlah dosen: ");
        int jumlah = Integer.parseInt(rhenza.nextLine());

        Dosen28[] arrayDosen28 = new Dosen28[jumlah];
        
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukab Data Dosen ke-" + (i+1));
            
            System.out.print("Kode                  : ");
            kode = rhenza.nextLine();
            System.out.print("Nama                  : ");
            nama = rhenza.nextLine();
            System.out.print("Jenis kelamin (L/P)   : ");
            dummy = rhenza.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("L");
            System.out.print("Usia                  : ");
            dummy = rhenza.nextLine();
            usia = Integer.parseInt(dummy);

            arrayDosen28[i] = new Dosen28(kode, nama, jenisKelamin, usia);
        }

        DataDosen28 data = new DataDosen28();

        System.out.println("\n===== Data Dosen =====");
        data.dataSemuaDosen(arrayDosen28);

        data.jumlahDosenPerJK(arrayDosen28);
        data.rerataUsiaDosenPerJenisKelamin(arrayDosen28);
        data.infoDosenPalingTua(arrayDosen28);
        data.infoDosenPalingMuda(arrayDosen28);
        rhenza.close();
    }
}
