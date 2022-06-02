package demo009.model;

public class Standort {

	/**
	 * Ort, in dem der Standort platziert wird. Die Funktionalität ist nicht vom Ortsnamen abhängig.
	 * Der Ort kann beliebig gewählt werden und dient lediglich der Illustration im Spiel. 
	 */
	private String ort;
	
	public Standort(String ort) {
		this.ort=ort;
	}

	/**
	 * Jeder Standort steht in einem Ort. Die Methode gibt den Ort des Standortes zurück.
	 * @return Ort, in dem der Standort steht.
	 */
	public String getOrt() {
		return ort;
	}

}
