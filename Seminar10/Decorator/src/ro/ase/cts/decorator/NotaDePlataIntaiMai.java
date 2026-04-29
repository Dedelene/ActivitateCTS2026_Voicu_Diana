package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlataIntaiMai extends NotaDePlataDecorator{
    public NotaDePlataIntaiMai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("1 mai cu mai multi mici!");
    }
}
