package ro.ase.cts.clase;

public class Student {
    private String nume;
    private ModSustinere modSustinere;

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere = new Grila();
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
