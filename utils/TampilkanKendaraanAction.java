package utils;

import moduls.VehicleManager;

public class TampilkanKendaraanAction implements MenuAction {
    private VehicleManager vehicleManager;

    public TampilkanKendaraanAction(VehicleManager vm) {
        this.vehicleManager = vm;
    }

    @Override
    public void execute() {
        vehicleManager.tampilkanKendaraan();
    }
}
