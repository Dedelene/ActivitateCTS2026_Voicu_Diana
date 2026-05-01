package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDep;
    private List<Structura> subStructuri;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        this.subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura){
        this.subStructuri.remove(structura);
    }

    public Structura getStructura(int poz){
        return this.subStructuri.get(poz);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + " Departament "+ this.numeDep);
        for(Structura struct : this.subStructuri){
            struct.afiseazaDetaliiStructura(spatii + " ");
        }
    }
}
