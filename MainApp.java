import java.util.Scanner;
import java.time.LocalDate;
import utils.MenuAction;
import utils.InputValidator;
import moduls.RentalManager;
import moduls.RentalTransaction;
import moduls.Vehicle;
import moduls.VehicleManager;
import moduls.Car;
import moduls.Motorcycle;

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
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Jenis (1: Mobil, 2: Motor): ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Plat Nomor: ");
                    String plat = scanner.nextLine();
                    if (!InputValidator.validasiPlat(plat))
                        break;

                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Tahun: ");
                    int tahun = scanner.nextInt();
                    scanner.nextLine();

                    Vehicle kendaraan = (jenis == 1)
                            ? new Car(plat, merk, tahun)
                            : new Motorcycle(plat, merk, tahun);

                    vehicleManager.tambahKendaraan(kendaraan);
                    break;

                case 2:
                    vehicleManager.tampilkanKendaraan();
                    break;

                case 3:
                    System.out.print("Nama Penyewa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Plat Nomor Kendaraan: ");
                    String platSewa = scanner.nextLine();

                    Vehicle v = vehicleManager.cariKendaraan(platSewa);
                    if (v == null) {
                        System.out.println("Kendaraan tidak ditemukan.");
                        break;
                    }

                    System.out.print("Tanggal Sewa (yyyy-mm-dd): ");
                    LocalDate tglSewa = InputValidator.validasiTanggal(scanner.nextLine());
                    if (tglSewa == null)
                        break;

                    System.out.print("Tanggal Kembali (yyyy-mm-dd): ");
                    LocalDate tglKembali = InputValidator.validasiTanggal(scanner.nextLine());
                    if (tglKembali == null)
                        break;

                    rentalManager.sewaKendaraan(nama, v, tglSewa, tglKembali);
                    break;

                case 4:
                    rentalManager.tampilkanSemuaTransaksi();
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
