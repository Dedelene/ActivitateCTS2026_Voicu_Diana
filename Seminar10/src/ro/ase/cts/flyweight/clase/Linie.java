package ro.ase.cts.flyweight.clase;

public class Linie implements LinieAbstracta {
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    protected Linie(String primaStatie, String ultimaStatie, int nrLinie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLinie(Autobuz autobuz) {
        System.out.println("Intre " + this.primaStatie + " si " + this.ultimaStatie + " circula pe linia " + this.nrLinie + " autobuzul: " + autobuz.toString());
    }

    @Override
    public void nrMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Nr maxim de calatori pe ruta " + this.primaStatie + "-" + this.ultimaStatie + " este de " + autobuz.getNrLocuri() + " calatori");
    }
}
