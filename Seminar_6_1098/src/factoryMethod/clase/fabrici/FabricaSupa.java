package factoryMethod.clase.fabrici;

import factoryMethod.clase.FelMancare;
import factoryMethod.clase.SupaCiuperci;
import factoryMethod.clase.SupaLegume;
import factoryMethod.clase.enums.TipMancare;
import factoryMethod.clase.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if(tipMancare == TipSupa.LEGUME){
            return new SupaLegume(pret, gramaj);
        } else if(tipMancare == TipSupa.CIUPERCI){
            return new SupaCiuperci(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return this.getFelMancare(tipMancare, pret, gramaj, calorii);
    }
}
