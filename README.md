# 🚗 Program Rental Kendaraan

Rental Kendaraan adalah program Java berbasis konsol yang dirancang untuk mengelola penyewaan kendaraan, seperti mobil dan motor. Program ini memungkinkan petugas rental untuk:

1. Menambahkan kendaraan baru ke dalam sistem.
2. Menyewakan kendaraan kepada pelanggan dengan validasi tanggal dan ketersediaan.
3. Melihat semua kendaraan yang tersedia atau sedang disewa.
4. Menampilkan riwayat transaksi penyewaan secara lengkap.
5. Program ini dibangun menggunakan paradigma Pemrograman Berorientasi Objek (OOP) dan memanfaatkan fitur abstract class, inheritance, interface, dan validasi input.
6. Struktur program dibuat modular dengan pembagian class yang rapi dalam package moduls dan utils.

---
## 🔎 Implementasi OOP
### 1. Object & Class
* Car.java → objek mobil dibuat dari class ini.
* Motorcycle.java → objek motor dibuat dari class ini.
* RentalTransaction.java → objek transaksi sewa.
* VehicleManager.java, RentalManager.java → membuat dan menyimpan daftar objek kendaraan/transaksi.

### 2. Attribute, Behavior & Constructor
* Vehicle.java → atribut umum: plat, merk, tahun; behavior: tampilkanInfo().
* Car.java, Motorcycle.java → konstruktor untuk inisialisasi data spesifik.
* RentalTransaction.java → atribut: penyewa, tanggal sewa/kembali; method: tampilkanDetail().

### 3. Encapsulation
* Vehicle.java dan turunannya → atribut private + getter() dan setter() bila diperlukan.
* RentalTransaction.java → akses data transaksi melalui method.
* VehicleManager.java, RentalManager.java → menyimpan list kendaraan/transaksi secara private.

### 4. Inheritance (Pewarisan)
* Car.java dan Motorcycle.java → extends Vehicle
* Vehicle.java sebagai superclass (abstract class).

### 5. Abstract & Interface
* Vehicle.java → class abstract dengan method abstract tampilkanInfo().
* MenuAction.java → interface untuk aksi-aksi menu dengan method execute().

### 7. Polymorphism
* VehicleManager.java → list ArrayList<Vehicle> menyimpan Car dan Motorcycle.
* RentalManager.java → method menggunakan parameter Vehicle.
* utils.MenuAction → semua action (TambahKendaraanAction, SewaKendaraanAction, dll) diakses sebagai MenuAction.

---

## 📦 Fitur Utama
### ✅ Manajemen Kendaraan
* Tambah kendaraan baru (mobil atau motor).
* Lihat seluruh kendaraan yang tersedia.
* Cari kendaraan berdasarkan plat nomor.

### ✅ Transaksi Penyewaan
* Sewa kendaraan berdasarkan tanggal.
* Validasi tumpang tindih penyewaan.
* Lihat semua transaksi penyewaan yang pernah dilakukan.

### ✅ Validasi Input
* Format **plat nomor**: `[A-Z]{1,2} [0-9]{1,4} [A-Z]{1,3}` (misal: `B 1234 CD`).
* Format **tanggal**: `yyyy-mm-dd` (misal: `2025-05-14`).

---

## 📁 Struktur Package & Kelas
### 📂 `moduls`
* **`Vehicle`** (abstract): Kelas dasar untuk kendaraan.
* **`Car`** & **`Motorcycle`**: Implementasi kendaraan.
* **`VehicleManager`**: Menyimpan dan mengelola kendaraan.
* **`RentalTransaction`**: Menyimpan data penyewaan.
* **`RentalManager`**: Mengelola proses penyewaan dan validasi tanggal.

### 📂 `utils`
* **`MenuAction`** (interface): Aksi yang dapat dieksekusi di menu.
* **`TampilkanKendaraanAction`**: Menampilkan daftar kendaraan.
* **`TambahKendaraanAction`**: Menambahkan kendaraan melalui input pengguna.
* **`SewaKendaraanAction`**: Menangani penyewaan kendaraan.
* **`LihatTransaksiAction`**: Menampilkan semua transaksi sewa.
* **`InputValidator`**: Validasi format plat dan tanggal input.

---

## 🖥️ Contoh Penggunaan
```
Jenis (1: Mobil, 2: Motor): 1
Plat Nomor: B 1234 CD
Merk: Toyota
Tahun: 2020
Tarif per Hari: 300000
Kendaraan berhasil ditambahkan.

Nama Penyewa: Budi
Plat Nomor Kendaraan: B 1234 CD
Tanggal Sewa (yyyy-mm-dd): 2025-05-14
Tanggal Kembali (yyyy-mm-dd): 2025-05-16
Durasi sewa: 3 hari
Tarif per hari: Rp300000.0
Total biaya sewa: Rp900000.0
Transaksi sewa berhasil.
```

## 💡 Cara Menjalankan
1. Pastikan semua class Java telah dikompilasi (`javac`).
2. Buat dan jalankan class `Main` untuk mengatur menu.
3. Gunakan input terminal untuk navigasi dan memasukkan data.

---

### 👥 Pembagian tugas kelompok
1. Muhammad Fadel Aryasatya Makkulau; MainApp, VehicleManager.
2. Moch Ichwanul Muslimin Mayang; Rental Manager, RentalTransaction.
3. Nur Atika Binti Ardi; LihatTransaksiAction, SewaKendaraanAction, TambahKendaraanAction, TampilkanKendaraanAction.
4. Azizah Nurul Izzah; Vehicle(SuperClass), Car(subClass), Motorcycle(subClass).

---
