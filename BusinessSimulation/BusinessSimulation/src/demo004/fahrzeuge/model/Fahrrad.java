package demo004.fahrzeuge.model;

public class Fahrrad extends Fahrzeug {
	private int anzahlGaenge;
	private Fahrradtyp fahrradtyp;
	private String rahmenNr;
	
	
	public Fahrrad(int anzahlRaeder, String hersteller, float gewicht, int
			anzahlGaenge, Fahrradtyp fahrradtyp, String rahmenNr) {
		super(anzahlRaeder, hersteller, gewicht);
		this.anzahlGaenge=anzahlGaenge;
		this.fahrradtyp=fahrradtyp;
		this.rahmenNr=rahmenNr;
	}

	public void move(int gang, int umdrehung) {
		
	}
	
	public String toString() {
		return super.toString() + ", Ganganzahl: "+anzahlGaenge+", Fahrradtyp: "+fahrradtyp+", RahmenNr: "+rahmenNr;
	}
	
	public int getAnzahlGaenge() {
		return anzahlGaenge;
	}

	public void setAnzahlGaenge(int anzahlGaenge) {
		this.anzahlGaenge = anzahlGaenge;
	}

	public Fahrradtyp getFahrradtyp() {
		return fahrradtyp;
	}

	public void setFahrradtyp(Fahrradtyp fahrradtyp) {
		this.fahrradtyp = fahrradtyp;
	}

	public String getRahmenNr() {
		return rahmenNr;
	}

	public void setRahmenNr(String rahmenNr) {
		this.rahmenNr = rahmenNr;
	}
}
