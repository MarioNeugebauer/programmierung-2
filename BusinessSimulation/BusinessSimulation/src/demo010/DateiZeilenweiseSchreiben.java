package demo010;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DateiZeilenweiseSchreiben {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("c:/daten/temp/testtext_03.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String eineZeile;
			for(int i=0; i<5; i++) {
				eineZeile="Das ist die Zeile "+i;
				bw.write(eineZeile);
				bw.newLine(); // Zeilenende plattformspezifisch
			}
			
			bw.close();
		} catch (IOException e) {
			// Fehler ausgeben
			e.printStackTrace();
		}
	}

}
