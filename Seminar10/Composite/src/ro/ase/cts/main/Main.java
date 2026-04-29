package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Structura dep1 = new Departament("Spital");
        Structura depAdministrativ = new Departament("Departament Administrativ");
        Structura sectieManagment = new Sectie("Management", 14);
        Structura sectieSecretariat = new Sectie("Secretariat", 5);

        ((Departament) dep1).adaugaStructura(depAdministrativ);
        ((Departament) dep1).adaugaStructura(sectieManagment);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        dep1.afiseazaDetaliiStructura("");

        ((Departament) dep1).stergeStructura(sectieManagment);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagment);

        System.out.println("Dupa modificare:");
        dep1.afiseazaDetaliiStructura("");
    }
}
