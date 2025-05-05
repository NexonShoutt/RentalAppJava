package moduls;

// Motorcycle.java
public class Motorcycle extends Vehicle {
    public Motorcycle(String platNomor, String merk, int tahun) {
        super(platNomor, merk, tahun);
    }

    @Override
    public void displayInfo() {
        System.out.println("Motor: " + getMerk() + " | Plat: " + getPlatNomor() + " | Tahun: " + getTahun());
    }
}