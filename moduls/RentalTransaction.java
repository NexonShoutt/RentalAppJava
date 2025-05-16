package moduls;

import java.time.LocalDate;

public class RentalTransaction {
    private static int counter = 1;
    private int id;
    private String namaPenyewa;
    private Vehicle kendaraan;
    private LocalDate tanggalSewa;
    private LocalDate tanggalKembali;

    public RentalTransaction(String namaPenyewa, Vehicle kendaraan, LocalDate tanggalSewa, LocalDate tanggalKembali) {
        this.id = counter++;
        this.namaPenyewa = namaPenyewa;
        this.kendaraan = kendaraan;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
    }

    public void displayTransaction() {
        System.out.println("ID: " + id + " | Penyewa: " + namaPenyewa);
        System.out.print(kendaraan instanceof Car ? "Mobil: " : "Motor: ");
        kendaraan.displayInfo();
        System.out.println("Sewa: " + tanggalSewa + " - Kembali: " + tanggalKembali);
        long jumlahHari = java.time.temporal.ChronoUnit.DAYS.between(tanggalSewa, tanggalKembali) + 1;
        double totalBiaya = jumlahHari * kendaraan.getTarifPerHari();
        System.out.println("Durasi: " + jumlahHari + " hari | Total biaya: Rp " + totalBiaya);
    }
    
    public Vehicle getKendaraan() {
        return kendaraan;
    }

    // Getter untuk tanggal sewa
    public LocalDate getTanggalSewa() {
        return tanggalSewa;
    }

    // Getter untuk tanggal kembali
    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

}
