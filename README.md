Aplikasi mobile saya terdiri dari 3 halaman :
1. Halaman Home :
2. Halaman Profile
3. Halaman Setting

A. Halaman Home
1. Kode tersebut menggunakan Jetpack Compose untuk membuat antarmuka pengguna (UI) dalam bentuk komposisi (Composable)
2. Terdapat penggunaan mutableStateOf dan remember untuk mengelola state aplikasi.
   Variabel angka digunakan untuk menyimpan nilai yang bisa berubah.
3. Kode ini menggunakan komponen layout seperti Box dan Column untuk mengatur tampilan UI
4. Terdapat tombol "Increment" yang mana apabila tombol tersebut d tekan oleh pengguna maka
   nilai variabel angka akan meningkat.

B. Halaman Profile
1. Kode ini menggunakan komponen layout seperti Box dan Column untuk mengatur tampilan UI. Box digunakan untuk mengisi seluruh layar, sedangkan Column digunakan untuk mengatur elemen-elemen UI secara vertikal.
2. Terdapat tampilan untuk di tampilkan di layar pengguna dengan teks "This is profile screens" yang ditampilkan di layar. 
3. Kode ini menggunakan background Color.White untuk mengatur latar belakang layar menjadi warna putih.

C. Halaman Setting
1. Fungsi Setting menerima parameter number dengan tipe data String. Ini memungkinkan untuk mengirim data atau informasi ke komponen Setting saat menggunakannya.
2. teks yang menggambarkan "This is settings screens, the number is $number". Variabel number yang diterima sebagai parameter digunakan untuk mengisi nilai yang akan ditampilkan pada layar. Ini memungkinkan tampilan informasi yang dinamis tergantung pada nilai number.
3. Warna Latar Belakang: Anda menggunakan background Color.White untuk mengatur latar belakang layar menjadi warna putih.


   
