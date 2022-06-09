package demo010;

import java.io.File;

public class ZeichenStatistikInDatei {

	public static void main(String[] args) {
		
		File textDatei = new File("c:/daten/temp/testtext.txt");
		
		// Programm verlassen, falls die Datei nicht existiert oder ein Verzeichnis ist
		if(!textDatei.exists() || textDatei.isDirectory()) {
			return;
		}
		
		// Array als Puffer fuer alle Bytes in der Datei, Abhaengig von Groesse der Datei
		byte[] pufferFuerBytesInDatei = new byte[(int) textDatei.length()];
		
		
		
		
		
	}
	
}
