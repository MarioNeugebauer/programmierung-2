package demo004.fahrzeuge.model;

public class Fahrzeug {
	private int anzahlRaeder;
	private String hersteller;
	private float gewicht;
	
	public Fahrzeug() {
		
	}
	public Fahrzeug(int anzahlRaeder, String hersteller, float gewicht) {
		this.anzahlRaeder=anzahlRaeder;
		this.hersteller=hersteller;
		this.gewicht=gewicht;
	}

	public void move(int meter) {
		
	}
	
	public String toString() {
		return "Raederanzahl: " + anzahlRaeder+"Hersteller: "+hersteller+"Gewicht: "+gewicht;
	}
	
	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public float getGewicht() {
		return gewicht;
	}

	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}
}
