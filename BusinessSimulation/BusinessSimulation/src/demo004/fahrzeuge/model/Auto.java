package demo004.fahrzeuge.model;

public class Auto extends Fahrzeug {
	private Motorart motorart;
	private float leistung;
	private float zuladung;
	private String fahrgestellNr;

	public Auto(int anzahlRaeder, String hersteller, float gewicht, Motorart motorart, float leistung, float zuladung, String fahrgestellNr) {
		super(anzahlRaeder, hersteller, gewicht);
		this.motorart=motorart;
		this.leistung=leistung;
		this.zuladung=zuladung;
		this.fahrgestellNr=fahrgestellNr;
	}

	public String toString() {
		return super.toString() + ", Motorart: "+motorart+", Leistung: "+leistung+", Zuladung: "+zuladung+", FahrgestellNr: "+fahrgestellNr;
	}
	
	public Motorart getMotorart() {
		return motorart;
	}

	public void setMotorart(Motorart motorart) {
		this.motorart = motorart;
	}

	public float getLeistung() {
		return leistung;
	}

	public void setLeistung(float leistung) {
		this.leistung = leistung;
	}

	public float getZuladung() {
		return zuladung;
	}

	public void setZuladung(float zuladung) {
		this.zuladung = zuladung;
	}

	public String getFahrgestellNr() {
		return fahrgestellNr;
	}

	public void setFahrgestellNr(String fahrgestellNr) {
		this.fahrgestellNr = fahrgestellNr;
	}
}
