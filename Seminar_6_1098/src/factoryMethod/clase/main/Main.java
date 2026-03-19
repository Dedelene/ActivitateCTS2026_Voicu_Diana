package factoryMethod.clase.main;

import factoryMethod.clase.FelMancare;
import factoryMethod.clase.enums.TipDesert;
import factoryMethod.clase.enums.TipSupa;
import factoryMethod.clase.fabrici.FabricaDesert;
import factoryMethod.clase.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15.5f, 300.0f);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 20.0f, 400.0f);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 15.5f, 200.0f, 500);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 20.5f, 300.0f, 400);

        supaCiuperci.afisare();
        supaLegume.afisare();

        clatite.afisare();
        papanasi.afisare();
    }
}
