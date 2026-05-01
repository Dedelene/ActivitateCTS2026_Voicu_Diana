package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{

    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("An nou fericit!");
    }
}
