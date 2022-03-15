package demo001.personalverwaltung;

public class Arbeitskraft {

	private String personalnr;
	private String name;
	private int gehalt;
	private String abteilung;
	
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
	 * Es kann die Abteilung für die Arbeitskraft festgelegt werden.
	 * 
	 * @param neueAbteilung die Abteilung, welcher die Arbeitskraft zugeordnet wird
	 */
	public void versetzeInAbteilung(String neueAbteilung) {
		this.abteilung=neueAbteilung;
	}
	
	/**
	 * Ein Teil der Personendaten kann fuer das Drucken eines Ausweises ausgegeben werden.
	 * 
	 * @return eine Zeichenkette, die Personalnummer, Name und Abteilung enthaelt
	 */
	public String druckeAusweis() {
		String ausgabeString = this.personalnr + ", "+this.name+", "+this.abteilung;
		return ausgabeString;
	}
	
	
}
 