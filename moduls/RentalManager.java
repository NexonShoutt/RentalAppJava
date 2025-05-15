package moduls;

import java.util.ArrayList;
import java.time.LocalDate;

public class RentalManager {
    private ArrayList<RentalTransaction> listTransaksi;

    public RentalManager() {
        listTransaksi = new ArrayList<>();
    }

    public void sewaKendaraan(String nama, Vehicle kendaraan, LocalDate tglSewa, LocalDate tglKembali) {
        // Cek apakah kendaraan sudah disewa pada periode tersebut
        if (isKendaraanSudahDisewa(kendaraan, tglSewa, tglKembali)) {
            System.out.println("Kendaraan sudah disewa pada periode ini.");
            return; // Jika sudah disewa, jangan lanjutkan proses sewa
        }
        RentalTransaction transaksi = new RentalTransaction(nama, kendaraan, tglSewa, tglKembali);
        listTransaksi.add(transaksi);
        System.out.println("Transaksi sewa berhasil.");
    }

    public boolean isKendaraanSudahDisewa(Vehicle kendaraan, LocalDate tglSewa, LocalDate tglKembali) {
        for (RentalTransaction transaksi : listTransaksi) {
            // Cek apakah kendaraan yang dimaksud sudah dipinjam dalam periode yang sama
            if (transaksi.getKendaraan().equals(kendaraan)) {
                // Cek apakah ada tumpang tindih tanggal
                if (!(tglKembali.isBefore(transaksi.getTanggalSewa())
                        || tglSewa.isAfter(transaksi.getTanggalKembali()))) {
                    return true; // Kendaraan sudah disewa pada periode yang diminta
                }
            }
        }
        return false; // Kendaraan tidak sedang disewa
    }

    public void tampilkanSemuaTransaksi() {
        for (RentalTransaction rt : listTransaksi) {
            rt.displayTransaction();
        }
    }
}
