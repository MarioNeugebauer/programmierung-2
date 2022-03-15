package demo001.simgame;

import java.util.Iterator;

public class BusinessSimulation001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wirtschaftssimulation Programmierung II");
		
		Niederlassung niederlassungEinbeck = new Niederlassung("Einbeck", Warenart.BIER, 1);
		Lager lagerAugsburg = new Lager("Augsburg");
		
		niederlassungEinbeck.anfordern();
		niederlassungEinbeck.produzieren();
		int produzierteMengeEinbeck = niederlassungEinbeck.abholen();
		Warenart produzierteWarenart = niederlassungEinbeck.getWarenart();

		System.out.println("Ort: "+niederlassungEinbeck.getOrt()+"\tWare: "
				+niederlassungEinbeck.getWarenartString()+"\tMenge: "+produzierteMengeEinbeck);
		
		lagerAugsburg.einlagern(produzierteWarenart, produzierteMengeEinbeck);

		System.out.println("Aktueller Bestand im Lager:");
		for (Iterator<Warenart> warenartIterator = lagerAugsburg.getEingelagerteWaren().iterator(); warenartIterator.hasNext();) {
			Warenart warenart = (Warenart) warenartIterator.next();
			System.out.println(Util.convertWarenartToString(warenart)+": "+lagerAugsburg.getBestand(warenart));
		}
		
		int preis = 10;
		
		int erloes = lagerAugsburg.verkaufen(produzierteWarenart, produzierteMengeEinbeck, preis);
		
		System.out.println("Erlös durch Verkauf: "+erloes);
		System.out.println("Aktueller Bestand im Lager:");
		for (Iterator<Warenart> warenartIterator = lagerAugsburg.getEingelagerteWaren().iterator(); warenartIterator.hasNext();) {
			Warenart warenart = (Warenart) warenartIterator.next();
			System.out.println(Util.convertWarenartToString(warenart)+": "+lagerAugsburg.getBestand(warenart));
		}
		
		
		
		
		
		
		
	}

	

}
