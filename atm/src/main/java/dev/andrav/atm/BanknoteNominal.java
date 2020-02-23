package dev.andrav.atm;

public enum BanknoteNominal implements Nominalable {
    NOMINAL_20(20),
    NOMINAL_25(25),
    NOMINAL_100(100),
    NOMINAL_500(500),
    NOMINAL_1000(1000),
    NOMINAL_5000(5000);

    private int nominal;

    BanknoteNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public int getNominal() {
        return nominal;
    }
}
