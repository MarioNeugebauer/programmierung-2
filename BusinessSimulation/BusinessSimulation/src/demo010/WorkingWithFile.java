package demo010;

import java.io.File;

public class WorkingWithFile {

	public static void main(String[] args) {

		// OS-unabhängig
		File datei01 = new File("datendatei.txt"); 	// Datei im aktuellen Verzeichnis der Programmausführung
		File datei02 = new File("../verz02");		// relative Pfadangabe eines Verzeichnisses
		
		// Windows
		File datei03 = new File("c:\\daten\\temp"); // doppelter Backslash für Escaping 
		File datei04 = new File("c:/daten/temp");	// unabhängig von Windows/Linux
		
		// Linux
		File datei05 = new File("/home/uname/dat.txt");	// absolute Pfadangabe in Linux/Unix
		File datei06 = new File("/mtn/usbmedia");		// Pfad zu gemountetem USB-Medium 
		
		// Pfadtrennzeichen abfragen
		char sepChar = File.separatorChar; 			// Windows: '\\'; Unix: '/'
		String sepString = File.separator;			// Windows: "\\"; Unix: "/"
		String sepStringSys = System.getProperty("file.separator"); // über Systemeigenschaften
		
		
		// wichtige Methoden in Klasse File
		// Instanz von File muss nicht physisch vorhanden sein
		File inputDatei = new File("c:\\daten\\inputfile.txt");
		
		// Pruefen, ob die Datei (oder auch Pfad) vorhanden ist
		boolean inputDateiExists = inputDatei.exists();
		
		// Laenge der Datei in Byte ermitteln
		long fileSize = inputDatei.length();
		
		// Instanz von File muss nicht physisch vorhanden sein
		File tiefesVerzeichnis = new File("c:/ein/tiefes/verzeichnis/mit/langem/pfad");
		
		// falls Verzeichnis c:/ein/tiefes/verzeichnis/mit/langem/ vorhanden ist,
		// wird nur letztes Verzeichnis erstellt
		boolean mkDirOk = tiefesVerzeichnis.mkdir();
		
		// falls mehrere uebergeordnete Verzeichnisse noch nicht vorhanden sind,
		// werden auch uebergeordnete Verzeichnisse mit erstellt
		boolean mkDirsOk = tiefesVerzeichnis.mkdirs();
		
		
		// Umbenennen oder Bewegen einer Datei
		boolean renameOk = inputDatei.renameTo(new File("c:\\daten\\inputfile_neu.txt"));
		
		// Datei oder Verzeichnis loeschen
		boolean deleteOk = inputDatei.delete();
		
		// Pruefen ob File-Instanz ein Verzeichnis oder eine Datei ist
		boolean isDirectory = tiefesVerzeichnis.isDirectory();
		
		// Verzeichnis lesen
		File auszulesendesVerzeichnis = new File("c:/daten/temp");
		
		// Verzeichnis als Array von Strings
		String[] fileNames = auszulesendesVerzeichnis.list();

		// Verzeichnis als Array von Files
		File[]   files = auszulesendesVerzeichnis.listFiles();
		
		
		
	}

}
