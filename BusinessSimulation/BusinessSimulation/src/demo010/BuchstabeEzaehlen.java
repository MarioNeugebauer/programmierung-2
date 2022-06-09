package demo010;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BuchstabeEzaehlen {
	public static void main(String[] args) {
		FileInputStream fis;
		File datei;
		int eCounter=0;
		try {
			datei = new File("c:/daten/temp/testtext.txt");
			fis = new FileInputStream(datei);
			byte[] pufferArray = new byte[(int) datei.length()]; 
			// Lesen in Datei bis Puffer voll oder Ende erreicht
			int anzahlBytesGelesen = fis.read(pufferArray);
			fis.close();
			int counter = 0;
			while(counter<anzahlBytesGelesen&&counter<pufferArray.length) {
				if((char)pufferArray[counter]=='e') {
					eCounter++; 
				}
				counter++;
			}
		} catch (IOException e) {
			// Fehlermeldung ausgeben
			e.printStackTrace();
		}
		System.out.print("Anzahl Buchstabe e: "+eCounter);
	}

}
