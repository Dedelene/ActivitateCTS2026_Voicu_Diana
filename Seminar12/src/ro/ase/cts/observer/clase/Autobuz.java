package ro.ase.cts.observer.clase;

public class Autobuz extends MijlocDeTransport{

    public Autobuz(String nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj = "Autobuzul de pe linia " + super.linie + " pleaca din depou";
        notificareCalatori(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj = "Autobuzul de pe linia " + super.linie + " nu mai circula";
        notificareCalatori(mesaj);
    }
}
