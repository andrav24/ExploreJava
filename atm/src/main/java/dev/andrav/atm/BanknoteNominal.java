package dev.andrav.atm;

public enum BanknoteNominal implements Nominalable {
    NOMINAL_20(20),
    NOMINAL_100(100),
    NOMINAL_500(500);

    private int nominal;

    BanknoteNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public int getNominal() {
        return nominal;
    }
}
