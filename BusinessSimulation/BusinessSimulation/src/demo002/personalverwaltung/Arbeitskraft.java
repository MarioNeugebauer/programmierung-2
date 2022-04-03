package demo002.personalverwaltung;

public class Arbeitskraft {

	private String personalnr;
	private String name;
	private int gehalt;
	private Abteilung abteilung;
	
	public Arbeitskraft(String nr, String name, int gehalt) {
		this.personalnr=nr;
		this.name=name;
		this.gehalt=gehalt;
	}
	
	/**
	 * Es kann das Gehalt fuer die Arbeitskraft erhoeht werden.
	 * 
	 * @param gehaltserhoehung Betrag, um den das Gehalt erhoeht werden soll
	 */
	public void erhoeheGehalt(int gehaltserhoehung) {
		this.gehalt = this.gehalt+gehaltserhoehung;
	}
	
	/**
	 * Ein Teil der Personendaten kann fuer das Drucken eines Ausweises ausgegeben werden.
	 * 
	 * @return eine Zeichenkette, die Personalnummer, Name und Abteilung enthaelt
	 */
	public String druckeAusweis() {
		String ausgabeString = this.personalnr + ", "+this.name;
		return ausgabeString;
	}

	public String getPersonalnr() {
		return personalnr;
	}

	public void setPersonalnr(String personalnr) {
		this.personalnr = personalnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public Abteilung getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(Abteilung abteilung) {
		this.abteilung = abteilung;
	}

	
}
 