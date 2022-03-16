package demo000;
import java.util.Scanner;

class ScannerInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Bitte eine Zeichenkette eingeben:");
    String zeichenkette = myObj.nextLine();
    
    System.out.println("Bitte einen Integer eingeben:");
    int einInteger = myObj.nextInt();

    // Output input by user
    System.out.println("Zeichenkette: " + zeichenkette);
    System.out.println("Ein Integer: " + einInteger);

    myObj.close();
  }
}
