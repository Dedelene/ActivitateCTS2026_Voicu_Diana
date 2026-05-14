package ro.ase.cts.observer.clase;

public class CalatorAbonat implements Calator {

    private String nume;
    private float sold;

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }


    public void platesteBilet(float pret){
        if(sold > pret){
            System.out.println(this.nume + " plateste " + pret + " pentru o calatorie");
            sold -= pret;
        }
        else{
            System.out.println("Sold insuficient");
        }
    }

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(this.nume + " ai primit urmatorul mesaj: " + mesaj);
    }
}
