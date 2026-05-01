package ro.ase.cts.clase;

public class Pacient {
    public String getNume() {
        return nume;
    }

    private String nume;
    private int gravitate;

    public int getGravitate() {
        return gravitate;
    }

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }
}
