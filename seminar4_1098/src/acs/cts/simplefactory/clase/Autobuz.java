package acs.cts.simplefactory.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul are un numar roti: ").append(super.nrRoti)
                .append(" cu numarul de inmatriculare: ").append(super.nrInmatriculare).append("\n");
        System.out.printf(sb.toString());
    }
}
