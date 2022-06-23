package demo008.interfaces.payment;

import java.math.BigDecimal;

public class PayBuddyService implements Payment {

	@Override
	public BigDecimal requestBalance(String accountId) {
		// hier wird das Konto abgefragt und der
		// Kontostand wird ermittelt, gemaess dem 
		// Protokoll, das mit PayBuddyService
		// ausgetauscht werden muss.
		
		// zum Test einfach nur ein Betrag
		return new BigDecimal(100);
	}

	@Override
	public int makePayment(BigDecimal amount, String fromAccountId, String toAccountId) {
		// hier wird gemaess dem Protokoll von 
		// PayBuddyService die Ueberweisung vorgenommen
		
		// 0 soll hier heissen, dass kein Fehler aufgetreten ist
		return 0;
	}

}
