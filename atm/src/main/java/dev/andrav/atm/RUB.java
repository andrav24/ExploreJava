package dev.andrav.atm;

public class RUB extends MyCurrency {

    //Nominalable nominal;
    //CurrencyType currency;

    private RUB(BanknoteNominal nominal) {
        super(nominal, CurrencyType.RUB);
    }

    public static RUB getInstance(int nominal) {
        switch (nominal) {
            case 100:
                return new RUB(BanknoteNominal.NOMINAL_100);
            case 500:
                return new RUB(BanknoteNominal.NOMINAL_500);
            case 1000:
                return new RUB(BanknoteNominal.NOMINAL_1000);
            case 5000:
                return new RUB(BanknoteNominal.NOMINAL_5000);
            default:
                throw new RuntimeException("Undefined banknote's nominal!");
        }
    }
}
