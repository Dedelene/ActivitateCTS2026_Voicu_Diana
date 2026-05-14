package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Autobuz;
import ro.ase.cts.observer.clase.CalatorAbonat;

public class Main {
    static void main(String[] args) {
        CalatorAbonat calatorAbonat = new CalatorAbonat("Adrian");
        CalatorAbonat calatorAbonat1 = new CalatorAbonat("Dorian");
        CalatorAbonat calatorAbonat2 = new CalatorAbonat("Codrut");
        CalatorAbonat calatorAbonat3 = new CalatorAbonat("Coconel");

        Autobuz autobuz = new Autobuz("10");

        autobuz.abonareCalator(calatorAbonat);
        autobuz.abonareCalator(calatorAbonat1);
        autobuz.abonareCalator(calatorAbonat2);

        autobuz.pleacaDinDepou();

        autobuz.abonareCalator(calatorAbonat3);

        autobuz.ramaneBlocatInTrafic();
        autobuz.notificareCalatori("blocat in trafic");
    }
}
