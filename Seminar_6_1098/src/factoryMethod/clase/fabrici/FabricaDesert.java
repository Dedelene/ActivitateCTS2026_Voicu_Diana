package factoryMethod.clase.fabrici;

import factoryMethod.clase.Clatite;
import factoryMethod.clase.FelMancare;
import factoryMethod.clase.Papanasi;
import factoryMethod.clase.enums.TipDesert;
import factoryMethod.clase.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare, pret, gramaj, 500);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if(tipMancare == TipDesert.PAPANASI){
            return new Papanasi(pret, gramaj, calorii);
        }
        else if(tipMancare == TipDesert.CLATITE){
            return new Clatite(pret, gramaj, calorii);
        }
        return null;
    }
}
