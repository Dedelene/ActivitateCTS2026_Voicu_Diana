package acs.cts.singleton;

public class Hotel {
    private String numeHotel;
    private int nrCamere;
    private int nrCamereOcupate;

    private static Hotel instanta = null;

    private Hotel(String numeHotel, int nrCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int nrCamere, int nrCamereOcupate){
        if(instanta == null){
            instanta = new Hotel(numeHotel, nrCamere, nrCamereOcupate);
        }
        return instanta;
    }

    public void rezervaCamera(){
        if(this.nrCamereOcupate < this.nrCamere){
            System.out.println("Rezervarea a fost realizata");
            this.nrCamereOcupate++;
        }
        else{
            System.out.println("Camere indisponibile");
        }
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder sb = new StringBuilder();
        sb.append("Numele hotelului: ")
                .append(this.numeHotel)
                .append(" are ").append(this.nrCamere - this.nrCamereOcupate).append(" camere disponibile.");
        System.out.printf(sb.toString());
    }

}
