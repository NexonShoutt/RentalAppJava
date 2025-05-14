package moduls;

public abstract class Vehicle {
    private String platNomor;
    private String merk;
    private int tahun;
    private double tarifPerHari;

    public Vehicle(String platNomor, String merk, int tahun, double tarifPerHari) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahun = tahun;
        this.tarifPerHari = tarifPerHari;
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

    public double getTarifPerHari() {
        return tarifPerHari;
    }

    public void setTarifPerHari(double tarifPerHari) {
        this.tarifPerHari = tarifPerHari;
    }

    public abstract void displayInfo();
}
