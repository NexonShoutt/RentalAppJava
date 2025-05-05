package moduls;

// Vehicle.java
public abstract class Vehicle {
    private String platNomor;
    private String merk;
    private int tahun;

    public Vehicle(String platNomor, String merk, int tahun) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public abstract void displayInfo();
}
