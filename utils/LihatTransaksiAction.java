package utils;

import moduls.RentalManager;

public class LihatTransaksiAction implements MenuAction {
    private RentalManager rentalManager;

    public LihatTransaksiAction(RentalManager rm) {
        this.rentalManager = rm;
    }

    @Override
    public void execute() {
        rentalManager.tampilkanSemuaTransaksi();
    }
}
