package dev.andrav.atm;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ATMImpl atm = new ATMImpl(RUB.class);
        BanknoteAnalyzer<Banknote<?>> analyzer = new BanknoteAnalyzer(RUB.class);


        List<Banknote<?>> cash = atm.getDemoData();
        atm.deposit(cash);

        analyzer.getAnalyze(cash);

        System.out.println(new Banknote<RUB>(RUB.getInstance(100)).equals(new Banknote<RUB>(RUB.getInstance(100))));
        System.out.println(RUB.getInstance(100).equals(RUB.getInstance(100)));

        //List<Banknote> unacceptedCash = atm.deposit(cash);
        //atm.getBalanceATM();
        //List receivedCash = atm.withdraw(3400);

        /*System.out.println("MyCurrency for deposit:");
        for (Banknote banknote : cash) {
            System.out.println(banknote.getBanknoteValue() + " " + banknote.getBanknoteCurrencySymbol());
        }*/

        /*System.out.println("Unaccepted cash:");
        if (unacceptedCash.size() > 0) {
            for (Banknote banknote : unacceptedCash) {
                System.out.println(banknote.getBanknoteValue() + " " + banknote.getBanknoteCurrencySymbol());
            }
        } else {
            System.out.println("None");
        }*/

    }
}
