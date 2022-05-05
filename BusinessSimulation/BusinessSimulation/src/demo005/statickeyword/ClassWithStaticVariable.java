package demo005.statickeyword;

public class ClassWithStaticVariable {

	private String eineStringVariable;
	private String zweiteStringVariable;
	
	public static int anzahl=0;
	
	public ClassWithStaticVariable(String var1, String var2) {
		eineStringVariable=var1;
		zweiteStringVariable=var2;
		
		// hochzaehlen der Anzahl der bisher instanziierten Objekte
		anzahl++;
	}
	
	public static void anzahlAufWertSetzen(int wert) {
		ClassWithStaticVariable.anzahl = wert;
	}
	
}
