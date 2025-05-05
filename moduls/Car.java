package moduls;

// Car.java
public class Car extends Vehicle {
    public Car(String platNomor, String merk, int tahun) {
        super(platNomor, merk, tahun);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mobil: " + getMerk() + " | Plat: " + getPlatNomor() + " | Tahun: " + getTahun());
    }
}
