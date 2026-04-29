package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataIntaiMai;
import ro.ase.cts.decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(188f, "12/04/2026");
        notaDePlata.printeaza();

        NotaDePlataDecorator notaDePlataDecorator;
        int a = 1;

        if(a == 1){
            notaDePlataDecorator = new NotaDePlataIntaiMai(notaDePlata);
        }
        else{
            notaDePlataDecorator = new NotaDePlataNoulAn(notaDePlata);
        }

        notaDePlataDecorator.printeazaFelicitare();
    }
}
