package Praktikum03;

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        Mahasiswa28[] arraOfMahasiswa28 = new Mahasiswa28[3];
        arraOfMahasiswa28[0] = new Mahasiswa28();
        arraOfMahasiswa28[0].nim = "244107060033";
        arraOfMahasiswa28[0].nama = "AGNE TITANIA KINANTI";
        arraOfMahasiswa28[0].kelas = "SIB-1E";
        arraOfMahasiswa28[0].ipk = (float) 3.75;

        arraOfMahasiswa28[1] = new Mahasiswa28();
        arraOfMahasiswa28[1].nim = "234172072";
        arraOfMahasiswa28[1].nama = "ACHMAD MAULANA HAMZAH";
        arraOfMahasiswa28[1].kelas = "TI-2A";
        arraOfMahasiswa28[1].ipk = (float) 3.36;

        arraOfMahasiswa28[2] = new Mahasiswa28();
        arraOfMahasiswa28[2].nim = "244107023006";
        arraOfMahasiswa28[2].nama = "DIRHAMAWAN PUTRANTO";
        arraOfMahasiswa28[2].kelas = "TI-2E";
        arraOfMahasiswa28[2].ipk = (float) 3.80;

        System.out.println("NIM     :" + arraOfMahasiswa28[0].nim);
        System.out.println("Nama    :" + arraOfMahasiswa28[0].nama);
        System.out.println("Kelas   :" + arraOfMahasiswa28[0].kelas);
        System.out.println("IPK     :" + arraOfMahasiswa28[0].ipk);
        System.out.println("-----------------------------------=");
        System.out.println("NIM     :" + arraOfMahasiswa28[1].nim);
        System.out.println("Nama    :" + arraOfMahasiswa28[1].nama);
        System.out.println("Kelas   :" + arraOfMahasiswa28[1].kelas);
        System.out.println("IPK     :" + arraOfMahasiswa28[1].ipk);
        System.out.println("-----------------------------------=");
        System.out.println("NIM     :" + arraOfMahasiswa28[2].nim);
        System.out.println("Nama    :" + arraOfMahasiswa28[2].nama);
        System.out.println("Kelas   :" + arraOfMahasiswa28[2].kelas);
        System.out.println("IPK     :" + arraOfMahasiswa28[2].ipk);
        System.out.println("-----------------------------------=");
        }
}
