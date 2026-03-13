package acs.cts.simplefactory.fabrica;

import acs.cts.simplefactory.clase.Autobuz;
import acs.cts.simplefactory.clase.MijlocTransport;
import acs.cts.simplefactory.clase.Tramvai;
import acs.cts.simplefactory.clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(Tipuri tip, int nrRoti, String nrInmatriculare){
        if(tip == Tipuri.AUTOBUZ){
            return new Autobuz(nrRoti, nrInmatriculare);
        }
        if(tip == Tipuri.TRAMVAI){
            return new Tramvai(nrRoti, nrInmatriculare);
        }
        if(tip == Tipuri.TROLEIBUZ){
            return new Troleibuz(nrRoti, nrInmatriculare);
        }
        return null;
    }
}
