package Praktikum03;

public class Dosen28 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen28(String kode, String nama, boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo(){
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis kelamin   : " + (jenisKelamin ? "Laki Laki" : "Permpuan"));
        System.out.println("Usia            : " + usia);
    }
}
