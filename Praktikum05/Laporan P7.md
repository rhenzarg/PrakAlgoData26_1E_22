# Laporan Praktikum Algoritma dan Struktur Data

<h4>Nama : Rhenza Rendragraha<h4>
<h4>NIM : 254107020049<h4>
<h4>Kelas : TI-1E<h4>


## Searching/ Pencarian Menggunakan Algoritma Sequential Search
- Kode Program

<img width="800" height="265" alt="Screenshot 2026-04-09 192356" src="https://github.com/user-attachments/assets/00a35fe2-e364-4f98-859c-ef976d51a584" />

<img width="646" height="762" alt="image" src="https://github.com/user-attachments/assets/0e0063fc-ed05-4d9a-bdec-9dc77529dd4b" />

- Output Program

<img width="291" height="846" alt="image" src="https://github.com/user-attachments/assets/42520932-5b0d-457d-92d2-abdf9e22a9bc" />

## Pertanyaan
1. Method tampilPosisi digunakan untuk menampilkan posisi atau indeks data mahasiswa yang ditemukan dalam array. Sedangkan method tampilDataSearch digunakan untuk menampilkan detail data mahasiswa yang ditemukan, seperti NIM, nama, kelas, dan IPK.
2. Perintah break berfungsi untuk menghentikan perulangan ketika data yang dicari sudah ditemukan. Dengan adanya break, program tidak perlu melanjutkan pencarian ke elemen berikutnya sehingga lebih efisien.
3. Variabel pos berfungsi untuk menyimpan posisi atau indeks data yang ditemukan dalam proses sequential search. Nilai ini digunakan untuk menampilkan letak data dan mengambil data yang sesuai dari array.
4. Hasil pencarian yang ditampilkan adalah data pertama yang ditemukan. Hal ini karena terdapat perintah break yang menghentikan pencarian setelah data ditemukan.
5. Jika break dihapus, maka perulangan akan terus berjalan hingga akhir array. Akibatnya, posisi yang tersimpan adalah posisi data terakhir yang memiliki nilai sama dengan yang dicari, bukan yang pertama.

## Searching/ Pencarian Menggunakan Algoritma Binary Search 
- kode Program
<img width="676" height="382" alt="image" src="https://github.com/user-attachments/assets/86871ab0-3f5b-44ef-b5aa-50c7ae4d8526" />
<img width="785" height="376" alt="image" src="https://github.com/user-attachments/assets/acd57c7f-363c-4a82-aad8-7a2fefc8b742" />

- Output Program
<img width="305" height="873" alt="image" src="https://github.com/user-attachments/assets/f132efe1-5d09-4178-ae24-7d9ff3beefca" />

## Pertanyaan
1. int mid = (left + right) / 2;
2. return findBinarySearch(cari, left, mid - 1); atau return findBinarySearch(cari, mid + 1, right);
3. left = batas kiri (awal) dari array yang sedang dicari
   right = batas kanan (akhir) dari array yang sedang dicari
   mid = indeks tengah yang digunakan untuk membagi array dan membandingkan nilai
4. Program tetap dapat dijalankan, tetapi hasil binary search tidak akan akurat. Hal ini karena binary search hanya bekerja dengan benar jika data sudah terurut (ascending atau descending).
5. Hasil binary search tidak sesuai, karena algoritma yang digunakan mengasumsikan data ascending.
   <img width="573" height="333" alt="image" src="https://github.com/user-attachments/assets/d83066e2-642b-4a1d-8b8c-08041d3ee299" />
   <img width="457" height="675" alt="image" src="https://github.com/user-attachments/assets/1ff80e71-249b-4e10-a61b-d40ef6ff1d23" />
6. Jika nilai left sudah lebih besar dari right, maka pencarian dihentikan dan fungsi mengembalikan -1.
7. Modifikasi Program
<img width="519" height="725" alt="image" src="https://github.com/user-attachments/assets/123e9296-e7c4-4231-8d41-f4cb892209de" />
<img width="454" height="829" alt="image" src="https://github.com/user-attachments/assets/26ef9ecc-1b69-4a9f-a633-fcaa0c1a8406" />

