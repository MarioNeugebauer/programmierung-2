package demo009.menu.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import demo009.util.Util;
import demo009.ApplicationContext;
import demo009.menu.Command;
import demo009.model.Warenart;

public class CommandVerkaufen implements Command {

	@Override
	public String menuItemName() {
		return "Verkaufen";
	}

	@Override
	public void execute(ApplicationContext context) {
		// Variablen fuer Auswahl und Menge der zu verkaufenden Warenart
		int auswahlWarenartIndex=0;
		int warenartMenge=0;
		
		List<Warenart> verfuegbareWarenarten = new ArrayList<Warenart>(context.getLager().getEingelagerteWaren());
		
		System.out.println("========== "+menuItemName());

		// Liste der Niederlassungen ausgeben
		System.out.println("========== Welche der verfügbaren Warenarten soll verkauft werden?");

		// Auswahlliste für die Warenart
		int indexWarenart;
		if(verfuegbareWarenarten.size()==0) {
			System.out.println("Das Lager ist leer. Es kann nichts verkauft werden.");
		}
		for (indexWarenart = 0; indexWarenart < verfuegbareWarenarten.size(); indexWarenart++) {
			String ausgabeString = indexWarenart+": %10s %d\n";
			System.out.printf(ausgabeString, Util.convertWarenartToString(verfuegbareWarenarten.get(indexWarenart)), context.getLager().getBestand(verfuegbareWarenarten.get(indexWarenart)) );
		}
		System.out.println(indexWarenart + ": Zurück");

		// Auswahl der Warenart, die zu verkaufen ist
		Scanner myScanner = new Scanner(System.in);
		boolean scannerErfolg=false;
		while(!scannerErfolg) {
			try {
				System.out.print("Auswahl:");
				auswahlWarenartIndex = myScanner.nextInt();
				scannerErfolg=true;
				myScanner.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				scannerErfolg=false;
				myScanner.nextLine();
			}
		}

		if(auswahlWarenartIndex==indexWarenart) {
			// Verlassen des Menus
			return;
		}
		
		Warenart ausgewaehlteWarenart = verfuegbareWarenarten.get(auswahlWarenartIndex);
		
		System.out.println("Wieviel "+Util.convertWarenartToString(ausgewaehlteWarenart)+" soll verkauft werden?");
		scannerErfolg=false;
		while(!scannerErfolg) {
			try {
				System.out.print("Menge:");
				warenartMenge = myScanner.nextInt();
				if(warenartMenge<=context.getLager().getBestand(ausgewaehlteWarenart)) {
					int erloes = context.getLager().verkaufen(ausgewaehlteWarenart, warenartMenge, context.getPreistabelle().get(ausgewaehlteWarenart));
					context.guthabenPlus(erloes);
					scannerErfolg=true;
				} else {
					System.out.println("Es können nur maximal "+context.getLager().getBestand(ausgewaehlteWarenart)+" Einheiten "+Util.convertWarenartToString(ausgewaehlteWarenart)+" verkauft werden.");
					scannerErfolg=false;
				}
				myScanner.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				scannerErfolg=false;
				myScanner.nextLine();
			}
		}

		
	}

}
