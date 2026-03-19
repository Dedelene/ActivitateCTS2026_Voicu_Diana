package prototype.clase;

public class Rezervare implements RezervareAbstracta{
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private String nrTel;

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziuaRezervarii = this.ziuaRezervarii;
        rezervareNoua.nrTel = this.nrTel;
        return rezervareNoua;
    }

    private Rezervare() {

    }

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String nrTel) {
        if(numeClient.length() > 1){
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Ion";
        }
        if(oraRezervare < 23 && oraRezervare > 9){
            this.oraRezervare = oraRezervare;
        }
        else {
            this.oraRezervare = 9;
        }

        if(ziuaRezervarii < 30){
            this.ziuaRezervarii = ziuaRezervarii;
        }
        else {
            this.ziuaRezervarii = 1;
        }

        if(nrTel.length() == 10){
            this.nrTel = nrTel;
        }
        else {
            this.nrTel = "0789345276";
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        if(ziuaRezervarii < 30){
            this.ziuaRezervarii = ziuaRezervarii;
        }
        else {
            this.ziuaRezervarii = 1;
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare < 23 && oraRezervare > 9){
            this.oraRezervare = oraRezervare;
        }
        else {
            this.oraRezervare = 9;
        }
    }
}
