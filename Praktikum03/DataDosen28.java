package Praktikum03;

public class DataDosen28 {
    
    public void dataSemuaDosen(Dosen28[] arrayDosen28){
        for (int i = 0; i < arrayDosen28.length; i++) {
            arrayDosen28[i].cetakInfo();
        }
        System.out.println("=====================================");
    }

    public void jumlahDosenPerJK(Dosen28[] arrayDosen28){
        int pria = 0;
        int wanita = 0;

        for (int i = 0; i < arrayDosen28.length; i++) {
            if (arrayDosen28[i].jenisKelamin == true) {
                pria++;
            }else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("=====================================");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen28[] arrayDosen28) {
        int totalPria = 0, totalWanita =0;
        int pria = 0, wanita = 0;

        for (int i = 0; i < arrayDosen28.length; i++) {
            if (arrayDosen28[i].jenisKelamin == true) {
                totalPria += arrayDosen28[i].usia;
                pria++;
            }else{
                totalWanita += arrayDosen28[i].usia;
                wanita++;
            }
        }
        if (pria > 0) {
            System.out.println("Rata rata usia dosen pria   : " + (totalPria/pria));
        }

        if (wanita > 0) {
            System.out.println("Rata rata usia dosen wanita : " + (totalWanita/wanita));
        }
        System.out.println("=====================================");
    }

    public void infoDosenPalingTua(Dosen28[] arrayDosen28){
        Dosen28 tertua = arrayDosen28[0];

        for (int i = 0; i < arrayDosen28.length; i++) {
            if (arrayDosen28[i].usia > tertua.usia) {
                tertua = arrayDosen28[i];
            }
        }

        System.out.println("Dosen Paling Tua: ");
        tertua.cetakInfo();
        System.out.println("=====================================");
    }

    public void infoDosenPalingMuda(Dosen28[] arrayDosen28){
        Dosen28 termuda = arrayDosen28[0];
        
        for (int i = 0; i < arrayDosen28.length; i++) {
            if (arrayDosen28[i].usia < termuda.usia) {
                termuda = arrayDosen28[i];
            }
        }

        System.out.println("Dosen Paling Muda: ");
        termuda.cetakInfo();
        System.out.println("=====================================");
    }
}
