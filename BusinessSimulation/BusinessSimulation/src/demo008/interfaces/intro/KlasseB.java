package demo008.interfaces.intro;

public class KlasseB implements InterfaceZwei {

	@Override
	public String methodeZweiA() {
		// Implementierung der Methode
		System.out.println("Methode Zwei A in KlasseB");
		return "Zwei A";
	}

	@Override
	public String methodeZweiB() {
		// Implementierung der Methode
		System.out.println("Methode Zwei B in KlasseB");
		return "Zwei B";
	}

}
