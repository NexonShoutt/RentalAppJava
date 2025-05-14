# 🚗 Program Rental Kendaraan

Program ini merupakan aplikasi berbasis Java untuk mengelola **penyewaan kendaraan**, mencakup kendaraan roda dua (motor) dan roda empat (mobil). Aplikasi ini mendukung fitur **pendaftaran kendaraan**, **penyewaan dengan validasi tanggal**, dan **pelacakan transaksi penyewaan**.

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

## 🛠️ Kebutuhan Pengembangan Selanjutnya
* Menyimpan data kendaraan & transaksi ke file.
* Antarmuka pengguna berbasis GUI (misalnya Java Swing/JavaFX).
* Fitur pengembalian kendaraan dan perhitungan total biaya.
