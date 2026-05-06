package ro.ase.cts.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 3){
            return "Troleibuz";
        }
        return super.succesor.recomandaCalatorie(distanta);
    }
}
