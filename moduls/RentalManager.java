package moduls;

import java.util.ArrayList;
import java.time.LocalDate;

public class RentalManager {
    private ArrayList<RentalTransaction> listTransaksi;

    public RentalManager() {
        listTransaksi = new ArrayList<>();
    }

    public void sewaKendaraan(String nama, Vehicle kendaraan, LocalDate tglSewa, LocalDate tglKembali) {
        RentalTransaction transaksi = new RentalTransaction(nama, kendaraan, tglSewa, tglKembali);
        listTransaksi.add(transaksi);
        System.out.println("Transaksi sewa berhasil.");
    }

    public void tampilkanSemuaTransaksi() {
        for (RentalTransaction rt : listTransaksi) {
            rt.displayTransaction();
        }
    }
}
