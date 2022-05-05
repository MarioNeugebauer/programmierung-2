package demo005.finalkeyword;

public class MyFooClass {

	private final int FINAL_VAR = 23;
	
	private int eineVariable;
	
	public MyFooClass(int wert) {
		eineVariable = wert;
	}
	
	public final int calculateSquare(int number) {
		return number*number;
	}

	public void methodWithFinalVar(final int finalVar) {
		finalVar = 10;
	}
	
	public void finaleVariableNurEinMalZuweisbar() {
		final int eineVariable;
		eineVariable = 3;
		// eineVariable = 4;
	}


	public int getEineVariable() {
		return eineVariable;
	}


	public void setEineVariable(int eineVariable) {
		this.eineVariable = eineVariable;
	}
	
	
}
