import java.util.Scanner;
import moduls.*;
import utils.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();
        RentalManager rentalManager = new RentalManager();

        boolean running = true;
        while (running) {
            System.out.println("\n===== Aplikasi Rental Kendaraan =====");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Daftar Kendaraan");
            System.out.println("3. Sewa Kendaraan");
            System.out.println("4. Lihat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = -1;

            // Memasukkan pilihan menu dengan pengecekan input yang aman
            try {
                pilihan = Integer.parseInt(scanner.nextLine()); // Menggunakan nextLine() dan parse
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka. Silakan coba lagi.");
            }

            MenuAction action = null;

            switch (pilihan) {
                case 1:
                    action = new TambahKendaraanAction(vehicleManager, scanner);
                    break;
                case 2:
                    action = new TampilkanKendaraanAction(vehicleManager);
                    break;
                case 3:
                    action = new SewaKendaraanAction(vehicleManager, rentalManager, scanner);
                    break;
                case 4:
                    action = new LihatTransaksiAction(rentalManager);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (action != null) {
                action.execute(); // Panggil aksi sesuai pilihan
            }
        }

        scanner.close();
    }
}
