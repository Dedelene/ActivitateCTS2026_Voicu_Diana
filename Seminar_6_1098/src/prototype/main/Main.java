package prototype.main;

import prototype.clase.Rezervare;
import prototype.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare("Ana", 20, 13, "0756247536");
        Rezervare rezervare2 = (Rezervare) rezervare1.clone();

        rezervare2.setOraRezervare(14);
        rezervare2.setZiuaRezervarii(5);

        System.out.printf(rezervare1 + "\n");
        System.out.printf(rezervare2.toString());
    }
}
