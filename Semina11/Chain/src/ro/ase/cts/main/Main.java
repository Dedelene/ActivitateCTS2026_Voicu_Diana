package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieTramvai);
        calatorieTramvai.setCalatorieHandler(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(5));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(12));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4));
    }
}
