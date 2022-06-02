package demo009.model;

public class Fuhrpark {

	private int anzahlFuhrwerke;
	
	private int preisFuhrwerk;
	
	public Fuhrpark(int anzahlFuhrwerke, int preisFuhrwerk) {
		this.anzahlFuhrwerke=anzahlFuhrwerke;
		this.preisFuhrwerk=preisFuhrwerk;
	}

	public int getAnzahlFuhrwerke() {
		return anzahlFuhrwerke;
	}

	public void setAnzahlFuhrwerke(int anzahlFuhrwerke) {
		this.anzahlFuhrwerke = anzahlFuhrwerke;
	}
	
	public int getPreisFuhrwerk() {
		return preisFuhrwerk;
	}

	public void setPreisFuhrwerk(int preisFuhrwerk) {
		this.preisFuhrwerk = preisFuhrwerk;
	}
	
}
