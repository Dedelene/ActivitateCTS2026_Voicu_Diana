package acs.cts.builder;

public class InternareBuilderAlternativ implements InternareBuilderAbstractA{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.halat = false;
        this.micDejun = false;
        this.papuci = false;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderAlternativ setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    @Override
    public Internare build(String nume) {
        Internare internare = new Internare(this.patRabatabil, this.micDejun, this.papuci, this.halat, nume);
        return internare;
    }
}
