package ro.ase.cts.clase.readere;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantReader{

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Aplicant aplicant = new Elev();
            super.readAplicanti(input2, aplicant);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
