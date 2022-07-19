package demo000;
import java.util.Scanner;

class ScannerInput {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); // Scanner der Eingabe

    System.out.println("Bitte eine Zeichenkette eingeben:"); // Ausgabe der Frage etc.
    String zeichenkette = myScanner.nextLine();
    
    System.out.println("Bitte einen Integer eingeben:");
    int einInteger = myScanner.nextInt();

    // Output input by user
    System.out.println("Zeichenkette: " + zeichenkette);
    System.out.println("Ein Integer: " + einInteger);
    
    boolean scannerSuccess = false;
    while(!scannerSuccess) {
        System.out.print("Eingabe: ");
    	if(myScanner.hasNextInt()) { // Checkt ob es ein Integer Wert besitzt
    		einInteger=myScanner.nextInt();
    		myScanner.nextLine();
    		scannerSuccess=true;
    	} else {
    		myScanner.nextLine();
    		scannerSuccess=false;
    	}
    }
    
    
    myScanner.close();
  }
}
