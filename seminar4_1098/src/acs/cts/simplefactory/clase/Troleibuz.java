package acs.cts.simplefactory.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul are un numar roti: ").append(super.nrRoti)
                .append(" cu numarul de inmatriculare: ").append(super.nrInmatriculare);
        System.out.printf(sb.toString());
    }
}
