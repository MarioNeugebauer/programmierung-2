package demo009.menu.impl;

import java.util.List;
import java.util.Scanner;

import demo009.ApplicationContext;
import demo009.menu.Command;
import demo009.model.Niederlassung;

/**
 *
 */
public class CommandAnfordern implements Command {

	@Override
	public String menuItemName() {
		return "Transport von Niederlassungen anfordern";
	}

	@Override
	public void execute(ApplicationContext context) {

		// true setzen, falls Integer eingegeben wurde, ansonsten false
		boolean scannerErfolg=false;

		// Variable für Eingabe der zu verkaufenden Menge
		int auswahlNiederlassungIndex=0;
		
		// Liste der Niederlassungen ausgeben
		System.out.println("========== "+menuItemName());
		System.out.println("========== Zu welcher Niederlassung sollen Fuhrwerke gesendet werden?");

		List<Niederlassung> listeNiederlassung = context.getNiederlassungen();

		int indexNdls;
		for (indexNdls = 0; indexNdls < listeNiederlassung.size(); indexNdls++) {
			String ausgabeString = indexNdls+": %10s %10s %20s %20s\n";
			
			// Zeichenketten fuer die Ausgabe erstellen
			String warenartString = listeNiederlassung.get(indexNdls).getWarenartString();
			String statusAnforderung = listeNiederlassung.get(indexNdls).wurdeAngefordert()==true?"angefordert":"nicht angefordert";
			int anzahlGeplanteFuhrwerke = listeNiederlassung.get(indexNdls).wurdeAngefordert()==true?context.getGeplanteFuhrwerke().get(listeNiederlassung.get(indexNdls)):0; 
			
			System.out.printf(ausgabeString, listeNiederlassung.get(indexNdls).getOrt(),
					warenartString,	statusAnforderung, anzahlGeplanteFuhrwerke);
		}

		// Abbrechen, falls keine Fuhrwerke mehr verfügbar sind
		if(context.getVerfuegbareFuhrwerke()==0) {
			System.out.println("Es sind keine Fuhrwerke mehr für das Senden zu Niederlassungen verfügbar.");
			// Verlassen des Menus
			return;
		}

		System.out.println(indexNdls + ": Zurück");

		// Auswahl der Niederlassung, bei der anzufordern ist
		Scanner myScanner = new Scanner(System.in);
		while(!scannerErfolg) {
			try {
				System.out.println("Es können nur maximal "+context.getVerfuegbareFuhrwerke()+" Fuhrwerk gesendet werden.");
				System.out.print("Auswahl:");
				auswahlNiederlassungIndex = myScanner.nextInt();
				scannerErfolg=true;
				myScanner.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				scannerErfolg=false;
				myScanner.nextLine();
			}
		}

		if(auswahlNiederlassungIndex==indexNdls) {
			// Verlassen des Menus
			return;
		}

		int anzahlZuSendenderFuhrwerke=0;
		scannerErfolg=false;
		while(!scannerErfolg) {
			try {
				System.out.print("Anzahl der zu sendenden Fuhrwerke:");
				anzahlZuSendenderFuhrwerke = myScanner.nextInt();
				if(context.getVerfuegbareFuhrwerke()>=anzahlZuSendenderFuhrwerke) {
					Niederlassung niederlassung = listeNiederlassung.get(auswahlNiederlassungIndex);
					context.getGeplanteFuhrwerke().put(niederlassung, anzahlZuSendenderFuhrwerke);
					scannerErfolg=true;
				} else {
					System.out.println("Es können nur maximal "+context.getVerfuegbareFuhrwerke()+" gesendet werden.");
					scannerErfolg=false;
				}
				myScanner.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				scannerErfolg=false;
				myScanner.nextLine();
			}
		}
		
		// Anforderung setzen
		listeNiederlassung.get(auswahlNiederlassungIndex).anfordern();
	}

}
