package demo009;

import java.util.ArrayList;
import java.util.HashMap;

import demo009.model.Fuhrpark;
import demo009.model.Lager;
import demo009.model.Niederlassung;
import demo009.model.Warenart;

public class ApplicationContext {
	
	// alle Niederlassungen, ueber die der Spieler verfuegen kann 
	private ArrayList<Niederlassung> niederlassungen = new ArrayList<Niederlassung>();
	
	// das zentrale Lager
	private Lager lager;
	
	// der Fuhrpark des Spielers
	private Fuhrpark fuhrpark;
	
	// pro Warenart gibt es einen festen Preis
	private HashMap<Warenart, Integer> preistabelle = new HashMap<Warenart, Integer>();
	
	// das Guthaben kann sich im Laufe des Spiels aendern
	private int guthaben=0;
	
	// Anzahl der Fuhrwerke (Value), die fuer jede Niederlassung (Key) fuer den Transport geplant sind 
	private HashMap<Niederlassung, Integer> geplanteFuhrwerke = new HashMap<Niederlassung, Integer>();
	
	public ApplicationContext() {
		initPreistabelle();
	}
	
	// die Preise werden fest vorgegeben
	private void initPreistabelle() {
		preistabelle.put(Warenart.BIER, 10);
		preistabelle.put(Warenart.WEIN, 12);
		preistabelle.put(Warenart.KORN, 14);
		preistabelle.put(Warenart.GLAS, 16);
		preistabelle.put(Warenart.TUCH, 18);
		preistabelle.put(Warenart.GOLD, 20);
	}
	
	// erhoehen des Guthabens
	public void guthabenPlus(int summand) {
		this.guthaben += summand;
	}

	// vermindern des Guthabens
	public void guthabenMinus(int minuend) {
		this.guthaben -= minuend;
	}

	public void addNiederlassung(Niederlassung niederlassung) {
		niederlassungen.add(niederlassung);
	}

	public ArrayList<Niederlassung> getNiederlassungen() {
		return niederlassungen;
	}

	public Lager getLager() {
		return lager;
	}

	public void setLager(Lager lager) {
		this.lager = lager;
	}

	public Fuhrpark getFuhrpark() {
		return fuhrpark;
	}

	public void setFuhrpark(Fuhrpark fuhrpark) {
		this.fuhrpark = fuhrpark;
	}

	public HashMap<Niederlassung, Integer> getGeplanteFuhrwerke() {
		return geplanteFuhrwerke;
	}
	
	public void geplanteTransporteZuruecksetzen() {
		geplanteFuhrwerke.clear();
	}
	
	/**
	 * Methode berechnet wieviele Fuhrwerke noch verfuegbar sind, unter Beachtung
	 * der Anforderungen, die an die unterschiedlichen Niederlassungen gesendet
	 * wurden
	 * @return Anzahl der noch in dieser Runde verfuegbaren Fuhrwerke
	 */
	public int getVerfuegbareFuhrwerke() {
		int summeGesendet = 0;
		for (Integer anzahlTransporte : geplanteFuhrwerke.values()) {
			summeGesendet+=anzahlTransporte;
		}
		return fuhrpark.getAnzahlFuhrwerke()-summeGesendet;
	}

	public HashMap<Warenart, Integer> getPreistabelle() {
		return preistabelle;
	}

	public int getGuthaben() {
		return guthaben;
	}
	
}
