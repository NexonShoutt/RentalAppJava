package utils;

import java.time.LocalDate;
import java.util.Scanner;
import moduls.RentalManager;
import moduls.Vehicle;
import moduls.VehicleManager;

public class SewaKendaraanAction implements MenuAction {
    private VehicleManager vehicleManager;
    private RentalManager rentalManager;
    private Scanner scanner;

    public SewaKendaraanAction(VehicleManager vm, RentalManager rm, Scanner sc) {
        this.vehicleManager = vm;
        this.rentalManager = rm;
        this.scanner = sc;
    }

    @Override
    public void execute() {
        System.out.print("Nama Penyewa: ");
        String nama = scanner.nextLine();

        System.out.print("Plat Nomor Kendaraan: ");
        String platSewa = scanner.nextLine();

        Vehicle kendaraan = vehicleManager.cariKendaraan(platSewa);
        if (kendaraan == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }

        System.out.print("Tanggal Sewa (yyyy-mm-dd): ");
        LocalDate tglSewa = InputValidator.validasiTanggal(scanner.nextLine());
        if (tglSewa == null)
            return;

        System.out.print("Tanggal Kembali (yyyy-mm-dd): ");
        LocalDate tglKembali = InputValidator.validasiTanggal(scanner.nextLine());
        if (tglKembali == null)
            return;

        // Pengecekan apakah kendaraan sudah disewa di rentang ini
        if (rentalManager.isKendaraanSudahDisewa(kendaraan, tglSewa, tglKembali)) {
            System.out.println("Kendaraan sudah disewa pada rentang tanggal tersebut.");
            return;
        }

        rentalManager.sewaKendaraan(nama, kendaraan, tglSewa, tglKembali);
    }
}