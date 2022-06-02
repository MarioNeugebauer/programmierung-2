package demo009.model;

import demo009.util.Util;

public class Niederlassung extends Standort {

	
	/**
	 * Warenart, die in der Produktion hergestellt wird
	 */
	private Warenart warenartProduktion;
	
	/**
	 * Anzahl der Arbeitenden, die in der Produktion arbeiten
	 */
	private int arbeitende;
	
	/**
	 * Gibt an, ob die Produktion ausgelöst wurde (true) oder nicht (false)
	 */
	private boolean produktionAngefordert;
	
	/**
	 * Anzahl der Einheiten der Warenart, die nach der Produktion zur Abholung bereit stehen.
	 */
	private int produzierteMenge=0;
	
	/**
	 * interner Parameter, der angibt, wieviele Einheiten der Ware pro Arbeitender produziert werden können 
	 */
	private int faktorArbeiterZuMenge=10;
	
	/**
	 * Konstruktor
	 * @param ort 		Ort, in dem sich die Niederlassung befinden soll
	 * @param warenart	die Warenart, welche in der Niederlassung produziert werden soll
	 * @param arbeitende	die Anzahl der Arbeiter, die bei Beginn in dieser Niederlassung angestellt sind
	 */
	public Niederlassung(String ort, Warenart warenart, int arbeitende) {
		super(ort);
		this.warenartProduktion=warenart;
		this.arbeitende=arbeitende;
	}

	/**
	 * Mit dieser Methode wird die Produktion der Warenart in der Niederlassung angefordert.
	 * Anschließend muss mit der Methode produzieren() die Produktion ausgelöst werden. 
	 */
	public void anfordern() {
		this.produktionAngefordert=true;
	}
	
	/**
	 * Diese Methode gibt zurück, ob die Produktion angefordert wurde. 
	 * @return true, falls die Produktion angefordert wurde; false, ansonsten
	 */
	public boolean wurdeAngefordert() {
		return this.produktionAngefordert;
	}
	
	/**
	 * Diese Methode löst die Produktion aus. Es wird allerdings nur dann Ware produziert, wenn
	 * vorher auch mit der Methode anfordern() die Produktion ausgelöst wurde. Ansonsten
	 * wird nichts produziert.
	 * Die Menge der produzierten Ware ist von der Anzahl der vorhandenen Arbeiter abhängig. 
	 * Außerdem unterliegt die Produktion einer zufälligen Schwankung.
	 */
	public void produzieren() {
		int zufaelligeSchwankungInProzent = (int)Math.round( Math.random() * 60.0)-30;
		if(this.produktionAngefordert) {
			this.produzierteMenge=this.arbeitende * this.faktorArbeiterZuMenge * (100-zufaelligeSchwankungInProzent)/100;
		} else {
			this.produzierteMenge=0;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int abholen() {
		int mengeAuslieferung = this.produzierteMenge;
		this.produzierteMenge=0;
		this.produktionAngefordert=false;
		return mengeAuslieferung;
	}
	
	/**
	 * Es können Arbeitende eingestellt werden.
	 * 
	 * @param anzahlEinzustellende Anzahl der neu einzustellenden Arbeitenden
	 */
	public void einstellen(int anzahlEinzustellende) {
		this.arbeitende=this.arbeitende+anzahlEinzustellende;
	}

	/**
	 * Es können Arbeitende entlassen werden.
	 * 
	 * @param anzahlEinzustellende Anzahl der neu einzustellenden Arbeitenden
	 */
	public void entlassen(int anzahlZuentlassender) {
		this.arbeitende=this.arbeitende-anzahlZuentlassender;
	}

	/**
	 * In der Klasse ist die Warenart gespeichert. Methode gibt die Warenart vom Datentyp Warenart zurück.
	 * @return Warenart vom Datentyp Warenart
	 */
	public Warenart getWarenart() {
		return this.warenartProduktion;
	}
	
	/**
	 * In der Klasse ist die Warenart gespeichert. Methode gibt den passenden String der Warenart zurück.
	 * @return String der Warenart
	 */
	public String getWarenartString() {
		return Util.convertWarenartToString(this.warenartProduktion);
	}
	
}
