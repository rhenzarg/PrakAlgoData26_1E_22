package P2;

public class MahasiswaMain28 {
    public static void main(String[] args) {
        Mahasiswa28 mhsl = new Mahasiswa28();
        mhsl.nama28 = "Rhenza Rendragraha";
        mhsl.nim28 = "254107020049";
        mhsl.kelas28 = "TI 1E";
        mhsl.ipk28 = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("TI 1F");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();
    }
}
