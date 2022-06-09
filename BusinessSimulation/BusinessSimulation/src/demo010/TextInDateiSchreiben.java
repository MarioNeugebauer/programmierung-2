package demo010;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextInDateiSchreiben {
	public static void main(String[] args) {
		FileWriter fw = null;
		// Datei initial erzeugen und schreiben
		try {
			// nur zum Schreiben oeffen, vorherige Daten gehen verloren
			fw = new FileWriter(new File("c:/daten/temp/testtext_02.txt"));
			fw.write("Das ist ein zweiter Testtext.\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Datei zum Anhaengen oeffnen und Text anhaengen
		try {
			// zum Anhaengen oeffen, vorherige Daten bleiben erhalten
			fw = new FileWriter(new File("c:/daten/temp/testtext_02.txt"),true);
			fw.write("Das ist eine zweite Zeile im Testtext.\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
