package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Command;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command com1 = new Plecare(new Autobuz("Mercedes"), 123);
        Command com2 = new Plecare(new Autobuz("Audi"), 223);

        operator.adaugaComanda(com1);
        operator.adaugaComanda(com2);
        operator.adaugaComanda(new Plecare(new Autobuz("BMW"), 445));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

        operator.executaComanda();
    }
}
