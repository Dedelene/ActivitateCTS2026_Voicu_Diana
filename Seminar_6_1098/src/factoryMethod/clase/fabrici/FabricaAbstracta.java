package factoryMethod.clase.fabrici;

import factoryMethod.clase.FelMancare;
import factoryMethod.clase.enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);

    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}
