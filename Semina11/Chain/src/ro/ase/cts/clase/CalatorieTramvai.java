package ro.ase.cts.clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 10){
            return "Tramvai";
        }
        return succesor.recomandaCalatorie(distanta);
    }
}
