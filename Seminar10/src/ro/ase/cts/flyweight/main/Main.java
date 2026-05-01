package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Autobuz;
import ro.ase.cts.flyweight.clase.ManagerLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz101 = new Autobuz("Mercedes", 1975, 50);
        Autobuz autobuz102 = new Autobuz("Otokar", 1960, 35);
        Autobuz autobuz103 = new Autobuz("Yutong", 2001, 40);

        ManagerLinie managerLinie = new ManagerLinie();
        managerLinie.getLinie(101, "Piata Romana", "Universitate").nrMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(102, "Otopeni", "Piata Presei").descriereLinie(autobuz102);
    }
}
