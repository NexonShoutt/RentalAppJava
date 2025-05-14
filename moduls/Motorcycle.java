package moduls;

public class Motorcycle extends Vehicle {
    public Motorcycle(String platNomor, String merk, int tahun, double tarifPerHari) {
        super(platNomor, merk, tahun, tarifPerHari);
    }

    @Override
    public void displayInfo() {
        System.out.println("Motor: " + getMerk() +
                " | Plat: " + getPlatNomor() +
                " | Tahun: " + getTahun() +
                " | Tarif: Rp " + getTarifPerHari() + "/hari");
    }
}
