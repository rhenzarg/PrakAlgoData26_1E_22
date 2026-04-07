package Praktikum05;

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        MahasiswaBerprestasi28 list = new MahasiswaBerprestasi28();
        Mahasiswa28 m1 = new Mahasiswa28("123", "Zidan", "2A", 3.2);
        Mahasiswa28 m2 = new Mahasiswa28("124", "Ayu", "2A", 3.5);
        Mahasiswa28 m3 = new Mahasiswa28("125", "Sofi", "2A", 3.1);
        Mahasiswa28 m4 = new Mahasiswa28("126", "Sita", "2A", 3.9);
        Mahasiswa28 m5 = new Mahasiswa28("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
