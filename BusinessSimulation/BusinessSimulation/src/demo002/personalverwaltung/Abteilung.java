package demo002.personalverwaltung;

import java.util.ArrayList;

public class Abteilung {

	private int abteilungsnummer;
	private String abteilungsbezeichnung;
	
	private ArrayList<Arbeitskraft> listeArbeitskraefte = new ArrayList<Arbeitskraft>();
	
	public Abteilung(int nr, String bezeichnung) {
		this.abteilungsnummer = nr;
		this.abteilungsbezeichnung = bezeichnung;
	}
	
	public void hinzufuegen(Arbeitskraft arbeitskraft) {
		if(listeArbeitskraefte!=null) {
			listeArbeitskraefte.add(arbeitskraft);
			arbeitskraft.setAbteilung(this);
		}
	}
	
	/**
	 * Loeschen der Arbeitskraft aus der Abteilung
	 * 
	 * @param persNrDerZuLoeschendenArbeitskraft Personalnummer der Arbeitskraft, die geloescht werden soll
	 * @return das Objekt der Arbeitskraft, welche aus der Liste geloescht wurde
	 */
	public Arbeitskraft loeschen(String persNrDerZuLoeschendenArbeitskraft) {
		if(listeArbeitskraefte!=null) {
			int i;
			boolean personalNrGefunden=false;
			for (i = 0; i < listeArbeitskraefte.size(); i++) {
				Arbeitskraft eineArbeitskraft = listeArbeitskraefte.get(i);
				if(eineArbeitskraft.getPersonalnr().equals(persNrDerZuLoeschendenArbeitskraft)) {
					personalNrGefunden=true;
					break; // for-Schleife verlassen, um mit aktuellem Index i zu löschen 
				}
			}
			if(personalNrGefunden) {
				return listeArbeitskraefte.remove(i);
			}
		}
		return null;
	}
	
	public void druckeAbteilungsdaten() {
		System.out.println("Abteilungsnr.: "+ this.abteilungsnummer+", "+"Abteilung: "+ this.abteilungsbezeichnung+":");
	}
	
	public void druckeArbeitskraefte() {
		System.out.println("Arbeitskräfte in Abteilung "+ this.abteilungsbezeichnung+":");
		for(int i=0; i<listeArbeitskraefte.size(); i++) {
			System.out.println(listeArbeitskraefte.get(i).getPersonalnr()+", "+listeArbeitskraefte.get(i).getName());
		}
	}
	
}
