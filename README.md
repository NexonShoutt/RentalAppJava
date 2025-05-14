# 🚗 Program Rental Kendaraan

Rental Kendaraan adalah program Java berbasis konsol yang dirancang untuk mengelola penyewaan kendaraan, seperti mobil dan motor. Program ini memungkinkan petugas rental untuk:

1. Menambahkan kendaraan baru ke dalam sistem.
2. Menyewakan kendaraan kepada pelanggan dengan validasi tanggal dan ketersediaan.
3. Melihat semua kendaraan yang tersedia atau sedang disewa.
4. Menampilkan riwayat transaksi penyewaan secara lengkap.
5. Program ini dibangun menggunakan paradigma Pemrograman Berorientasi Objek (OOP) dan memanfaatkan fitur abstract class, inheritance, interface, dan validasi input.
6. Struktur program dibuat modular dengan pembagian class yang rapi dalam package moduls dan utils.

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

## 🧪 Contoh Penggunaan
```
Jenis (1: Mobil, 2: Motor): 1
Plat Nomor: B 1234 CD
Merk: Toyota
Tahun: 2020
Tarif: 300000
Kendaraan berhasil ditambahkan.

Nama Penyewa: Budi
Plat Nomor Kendaraan: B 1234 CD
Tanggal Sewa (yyyy-mm-dd): 2025-05-14
Tanggal Kembali (yyyy-mm-dd): 2025-05-16
Transaksi sewa berhasil.
```

## 🏃 Cara Menjalankan
1. Pastikan semua class Java telah dikompilasi (`javac`).
2. Buat dan jalankan class `Main` untuk mengatur menu.
3. Gunakan input terminal untuk navigasi dan memasukkan data.

---
