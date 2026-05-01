package ro.ase.cts.clase.spital;

public class Medicament {

    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }
    public String getNume() {
        return nume;
    }

    public void achizitioneazaMedicament(){
        if(this.prezintaReteta())
            System.out.println("Medicamentul " + this.nume + " a fost achizitionat!");
        else
            System.out.println("Este nevoie de reteta!");
    }

    public boolean prezintaReteta(){
        return this.nume.length() >= 10;
    }
}
