package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int VALOARE_FINANTARE_ELEV = 10;

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}

	public static void setValoareFinantareElev(int valoareFinantareElev) {
		VALOARE_FINANTARE_ELEV = valoareFinantareElev;
	}

	@Override
	public void afisazaFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste "+Angajat.VALOARE_FINANTARE_ELEV+" Euro/zi in proiect.");
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}
}
