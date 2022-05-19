package demo008.interfaces.intro;

public class KlasseC implements InterfaceEins, InterfaceZwei {

	@Override
	public int methodeEinsA() {
		// Implementierung der Methode
		System.out.println("Abarbeiten der Methode Eins A in Klasse C");
		return 0;
	}

	@Override
	public String methodeZweiA() {
		// Implementierung der Methode
		System.out.println("Abarbeiten der Methode Zwei A in Klasse C");
		return "Rückgabe Zwei A";
	}

	@Override
	public String methodeZweiB() {
		// Implementierung der Methode
		System.out.println("Abarbeiten der Methode Zwei B in Klasse C");
		return "Rückgabe Zwei B";
	}


}
