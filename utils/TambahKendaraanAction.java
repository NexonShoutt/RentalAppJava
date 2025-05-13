package utils;

import java.util.Scanner;
import moduls.Car;
import moduls.Motorcycle;
import moduls.Vehicle;
import moduls.VehicleManager;

public class TambahKendaraanAction implements MenuAction {
    private VehicleManager vehicleManager;
    private Scanner scanner;

    public TambahKendaraanAction(VehicleManager vm, Scanner sc) {
        this.vehicleManager = vm;
        this.scanner = sc;
    }

    @Override
    public void execute() {
        int jenis = -1;

        // Loop sampai jenis kendaraan valid (1 atau 2)
        while (jenis != 1 && jenis != 2) {
            System.out.print("Jenis (1: Mobil, 2: Motor): ");
            try {
                jenis = Integer.parseInt(scanner.nextLine()); // membaca input jenis kendaraan
                if (jenis != 1 && jenis != 2) {
                    System.out.println("Input tidak valid. Pilih 1 untuk Mobil atau 2 untuk Motor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka 1 atau 2. Silakan coba lagi.");
            }
        }
        System.out.print("Plat Nomor: ");
        String plat = scanner.nextLine();
        if (!InputValidator.validasiPlat(plat)) {
            System.out.println("Format plat nomor tidak valid.");
            return;
        }

        System.out.print("Merk: ");
        String merk = scanner.nextLine();
        System.out.print("Tahun: ");
        int tahun = scanner.nextInt();
        scanner.nextLine();

        Vehicle kendaraan = (jenis == 1)
                ? new Car(plat, merk, tahun)
                : new Motorcycle(plat, merk, tahun);

        vehicleManager.tambahKendaraan(kendaraan);
    }
}
