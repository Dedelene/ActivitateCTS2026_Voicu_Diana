package acs.cts.simplefactory.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvaiul are un numar roti: ").append(super.nrRoti)
                .append(" cu numarul de inmatriculare: ").append(super.nrInmatriculare);
        System.out.printf(sb.toString());
    }
}
