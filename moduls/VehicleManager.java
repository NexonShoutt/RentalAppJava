package moduls;

import java.util.ArrayList;

public class VehicleManager {
    private ArrayList<Vehicle> listKendaraan;

    public VehicleManager() {
        listKendaraan = new ArrayList<>();
    }

    public void tambahKendaraan(Vehicle kendaraan) {
        listKendaraan.add(kendaraan);
        System.out.println("Kendaraan berhasil ditambahkan.");
    }

    public void tampilkanKendaraan() {
        for (Vehicle v : listKendaraan) {
            v.displayInfo();
        }
    }

    public Vehicle cariKendaraan(String platNomor) {
        for (Vehicle v : listKendaraan) {
            if (v.getPlatNomor().equalsIgnoreCase(platNomor)) {
                return v;
            }
        }
        return null;
    }

    public ArrayList<Vehicle> getListKendaraan() {
        return listKendaraan;
    }
}
