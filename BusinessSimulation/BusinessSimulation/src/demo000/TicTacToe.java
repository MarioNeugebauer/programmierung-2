package demo000;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
	    Scanner myScanner = new Scanner(System.in);

		// Variable, um die mit Scanner eingebene Feldnummer zu speichern
		int feldEingegeben=0;

		// true setzen, falls Integer eingegeben wurde, ansonsten false
		boolean scannerErfolg=false;
		

		// ...
		
		while(!scannerErfolg) {
			try {
			    System.out.println("Feldnummer als Integer eingeben:");
			    feldEingegeben = myScanner.nextInt();
				scannerErfolg=true;
			} catch (Exception e) {
				scannerErfolg=false;
				myScanner.nextLine();
			}
		}

		// nur zum Test
		System.out.println(feldEingegeben);
		
		// ab hier steht in feldEingegeben die Feldnummer, welche der Spieler eingegeben hat.

		// ...


	}

}
