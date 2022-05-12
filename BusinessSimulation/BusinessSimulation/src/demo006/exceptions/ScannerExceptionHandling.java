package demo006.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionHandling {

	Logger logger = System.getLogger("standard logger");
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		try {
			System.out.println("Bitte einen Integer eingeben:");
			int einInteger = myScanner.nextInt();
			System.out.println("Eingegebener Integer: "+einInteger);
			
		} catch(InputMismatchException inputMismatchException) {
			System.out.println("Fehler bei der Eingabe! Es wurde kein Integerwert eingegeben.");
		} finally {
			System.out.println("Finally, der Scanner wird noch geschlossen.");
			myScanner.close();
		}

	}
	
	public int getIntegerFromFile(String fileName) {
	    try (Scanner contents = new Scanner(new File(fileName)) ) {
	        return Integer.parseInt(contents.nextLine());
	    } catch (FileNotFoundException e) {
	    	System.out.println("Player file not found!" + e);
	        return 0;
	    } catch (NumberFormatException e) {
	    	System.out.println("Player file was corrupted!" + e);
	        return 0;
	    }
	}

}
