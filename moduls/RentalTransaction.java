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
        kendaraan.displayInfo();
        System.out.println("Sewa: " + tanggalSewa + " - Kembali: " + tanggalKembali);
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}
