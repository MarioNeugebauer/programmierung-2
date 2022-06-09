package demo010;

public class DatenContainer {
	int nummer;
	String bezeichnung;
	String inhalt;
	int wert;
	
	public DatenContainer(int nummer, String bezeichnung, String inhalt, int wert) {
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.inhalt = inhalt;
		this.wert = wert;
	}
	
	public String toString() {
		return nummer+"\t"+bezeichnung+"\t"+inhalt+"\t"+wert;
	}
	
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		bezeichnung = bezeichnung;
	}
	public String getInhalt() {
		return inhalt;
	}
	public void setInhalt(String inhalt) {
		inhalt = inhalt;
	}
	
	public int getWert() {
		return wert;
	}
	public void setWert(int wert) {
		this.wert = wert;
	}
}
