package demo001.simgame;

import java.util.HashMap;
import java.util.Set;

/**
 * Das Lager kann Waren verschiedener Art aufnehmen, lagern und wieder abgeben.
 */
public class Lager {

	/**
	 * Ort, in dem das Lager platziert wird. Die Funktionalität ist nicht vom Ortsnamen abhängig.
	 * Der Ort kann beliebig gewählt werden und dient lediglich der Illustration im Spiel. 
	 */
	private String ort;

	/**
	 * Erfassung der Warenarten im Lager und der jeweiligen Lagerbestände. Wenn eine Warenart
	 * nicht im Lager vorhanden ist, wird sie auch in dieser HashMap nicht geführt.
	 */
	private HashMap<Warenart, Integer> lagerbestand = new HashMap<Warenart, Integer>();
	
	/**
	 * Konstruktor
	 * @param ort 	Ort, in dem sich das Lager befinden soll
	 */
	public Lager(String ort) {
		this.ort=ort;
	}
	
	/**
	 * Einlagern von Waren einer bestimmten Warenart mit einer bestimmten Menge. Mit dem Aufruf
	 * wird der Lagerbestand entsprechend erhöht.
	 * @param warenart			die Warenart, welche eingelagert werden soll 
	 * @param mengeEinlagern	die Menge der genannten Warenart, die eingelagert werden soll
	 */
	public void einlagern(Warenart warenart, int mengeEinlagern) {
		if(lagerbestand.containsKey(warenart)) {
			// es gibt schon einen Bestand der Warenart, also muss die bisher gelagerte Menge zur
			// einzulagernden Menge addiert werden
			int bisherigerBestand = lagerbestand.get(warenart).intValue();
			int neuerBestand = bisherigerBestand+mengeEinlagern;
			lagerbestand.put(warenart, neuerBestand);
		} else {
			// es gibt noch keinen Bestand der Warenart, also nur die menge einlagern 
			lagerbestand.put(warenart, mengeEinlagern);
		}
	}
	
	/**
	 * Verkaufen von Waren führt zum Verringern von Warenbestand der genannten Warenart.
	 * Wenn weniger als die zu verkaufende Menge im Lager vorhanden ist, dann wird
	 * der gesamte Bestand der betreffenden Warenart verkauft.
	 * @param warenart			die Warenart, von welcher Waren verkauft werden sollen
	 * @param mengeVerkaufen	die Menge, die zu verkaufen ist
	 * @param preis				der Preis, zu welchem die Warenart verkauft wird
	 * @return					Erlös in Taler, der durch den Verkauf zum genannten Preis erzielt wird 
	 */
	public int verkaufen(Warenart warenart, int mengeVerkaufen, int preis) {
		if(lagerbestand.containsKey(warenart)) {
			if(lagerbestand.get(warenart)>=mengeVerkaufen) {
				int bisherigerBestand = lagerbestand.get(warenart).intValue();
				int neuerBestand = bisherigerBestand-mengeVerkaufen;
				lagerbestand.put(warenart, neuerBestand);
				return mengeVerkaufen*preis; 
			} else if(lagerbestand.get(warenart)>0) {
				int bisherigerBestand = lagerbestand.get(warenart).intValue();
				lagerbestand.remove(warenart);
				return bisherigerBestand*preis;
			} 
		} 
		return -1;
	}
	
	/**
	 * @return ein Set mit allen Warenarten, die gerade mit einer Menge > 0 im Lager eingelagert sind
	 */
	public Set<Warenart> getEingelagerteWaren() {
		return lagerbestand.keySet();
	}
	
	/**
	 * Bestand der Warenart im Lager ermitteln
	 * @param warenart	Warenart, von welcher der Bestand ermittelt werden soll
	 * @return			Anzahl der Wareneinheiten, die im Lager von der angegebenen Warenart vorhanden sind
	 */
	public int getBestand(Warenart warenart) {
		if(lagerbestand.containsKey(warenart)) {
			return lagerbestand.get(warenart).intValue();
		} else {
			return -1;
		}
	}
	
}
