package P2;

public class Mahasiswa28 {
    String nama28;
    String nim28;
    String kelas28;
    double ipk28;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama28);
        System.out.println("NIM: "+ nim28);
        System.out.println("IPK: " + ipk28);
        System.out.println("Kelas: " + kelas28);
    }

    void ubahKelas(String kelasBaru28) {
        kelas28 = kelasBaru28;
    }

    void updateIpk (double ipkbaru28) {
        ipk28 = ipkbaru28;
    }

    String nilaiKinerja () {
        if (ipk28 >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk28 >= 3.0) {
            return "Kinerja baik";
        }else if (ipk28 >= 2.0) {
            return "Kinerja cukup";
        }else {
            return "Kinerja kurang";
        }
    }
}
