package ro.ase.cts.main;

import ro.ase.cts.clase.adapter.Adapter;
import ro.ase.cts.clase.spital.Medicament;

public class Main {

    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medFarmacie){
        medFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament med1 = new Medicament("Paracetamol", 12f);
        ro.ase.cts.clase.farmacie.Medicament med2 = new ro.ase.cts.clase.farmacie.Medicament("Algocalmin");

        med1.achizitioneazaMedicament();
        med2.cumparaMedicament();

        procurareMedicament(med2);
        //procurareMedicament(med1);

        Adapter adaptor = new Adapter(med1);
        procurareMedicament(adaptor);
    }
}
