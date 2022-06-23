package demo008.interfaces.payment;

public class ExampleWebshop {

	public static void main(String[] args) {

		String paymentMethod;
		
		// Variablen nur mit Interface als Datentyp deklarieren
		// und mit konkreter Klasse instanziieren
		// hier ist noch nicht bekannt, welcher Service genutzt
		// werden soll
		Payment paymentServicePayBuddy = new PayBuddyService();
		Payment paymentServiceMoneyTransfer = new MoneyTransferService();
		
		// irgendwelcher Webshop-Programmcode
		
		// Nutzer macht Eingabe zu gewuenschter Zahlungsmethode
		paymentMethod = "PayBuddy";
		
		// Ueberweisung machen
		

		

	}

}
