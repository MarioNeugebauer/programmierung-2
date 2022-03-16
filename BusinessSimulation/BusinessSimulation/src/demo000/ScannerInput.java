package demo000;
import java.util.Scanner;

class ScannerInput {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Bitte eine Zeichenkette eingeben:");
    String zeichenkette = myScanner.nextLine();
    
    System.out.println("Bitte einen Integer eingeben:");
    int einInteger = myScanner.nextInt();

    // Output input by user
    System.out.println("Zeichenkette: " + zeichenkette);
    System.out.println("Ein Integer: " + einInteger);
    

    myScanner.close();
  }
}
