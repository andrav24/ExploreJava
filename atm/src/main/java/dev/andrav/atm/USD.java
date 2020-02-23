package dev.andrav.atm;

public class USD extends MyCurrency {

    //Nominalable nominal;
    //CurrencyType currency;

    private USD(BanknoteNominal nominal) {
        super(nominal, CurrencyType.USD);
    }

    public static USD getInstance(int nominal) {
        switch (nominal) {
            case 10:
                return new USD(BanknoteNominal.NOMINAL_10);
            case 20:
                return new USD(BanknoteNominal.NOMINAL_20);
            case 50:
                return new USD(BanknoteNominal.NOMINAL_50);
            case 100:
                return new USD(BanknoteNominal.NOMINAL_100);
            default:
                throw new RuntimeException("Undefined banknote's nominal!");
        }
    }
}
