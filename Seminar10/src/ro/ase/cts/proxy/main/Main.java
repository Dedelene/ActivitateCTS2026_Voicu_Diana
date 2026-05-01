package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz168 = new Autobuz(23, 168);
        MijlocDeTransport autobuz226 = new Autobuz(0, 226);

        Statie statieRomana = new Statie("Piata Romana", 10);
        Statie statieUniversitate = new Statie("Universitate", 0);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuzNoapteN168 = new AutobuzNoapte(autobuz168);
        MijlocDeTransport autobuzNoapteN226 = new AutobuzNoapte(autobuz226);

        System.out.println("-----------------------------------------------");

        autobuzNoapteN168.opresteInStatie(statieRomana);
        autobuzNoapteN226.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuz = new Autobuz(12, 6, TipCursa.CURSA_SPECIALA);

        System.out.println("------------------------------------------------");
        MijlocDeTransport autobuzSpecial = new AutobuzCursaSpeciala(autobuz);
        MijlocDeTransport autobuzSpecial168 = new AutobuzCursaSpeciala(autobuz168);

        autobuzSpecial.opresteInStatie(statieRomana);
        autobuzSpecial168.opresteInStatie(statieUniversitate);
    }
}
