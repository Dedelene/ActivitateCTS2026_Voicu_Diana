package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    private List<Calator> calatori;
    protected String linie;

    public MijlocDeTransport(String nrLinie) {
        this.calatori = new ArrayList<>();
        this.linie = nrLinie;
    }

    public void abonareCalator(Calator calator){
        this.calatori.add(calator);
    }

    public void dezabonareCalatori(Calator calator){
        this.calatori.remove(calator);
    }

    public void notificareCalatori(String mesaj){
        for(Calator calator : this.calatori){
            calator.notificare(mesaj);
        }
    }

    public abstract void pleacaDinDepou();

    public abstract void ramaneBlocatInTrafic();

}
