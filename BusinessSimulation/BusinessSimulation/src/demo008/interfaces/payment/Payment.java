package demo008.interfaces.payment;

import java.math.BigDecimal;

public interface Payment {

	public BigDecimal requestBalance(String accountId);
	
	public int makePayment(BigDecimal amount, String fromAccountId, String toAccountId); 
	
}
