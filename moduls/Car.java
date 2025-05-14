package moduls;

public class Car extends Vehicle {
    public Car(String platNomor, String merk, int tahun, double tarifPerHari) {
        super(platNomor, merk, tahun, tarifPerHari);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mobil: " + getMerk() +
                " | Plat: " + getPlatNomor() +
                " | Tahun: " + getTahun() +
                " | Tarif: Rp " + getTarifPerHari() + "/hari");
    }
}
