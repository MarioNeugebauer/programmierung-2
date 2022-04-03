package demo002.personalverwaltung;

public class VerwaltungArbeitskraefte {

	public static void main(String[] args) {
		
		Abteilung abtEntwicklung = new Abteilung(0, "Entwicklung");
		Abteilung abtTest = new Abteilung(1, "Test");

		abtEntwicklung.hinzufuegen(new Arbeitskraft("001", "Müller", 1000));
		abtEntwicklung.hinzufuegen(new Arbeitskraft("002", "Schulz", 1000));
		abtTest.hinzufuegen(new Arbeitskraft("003", "Lehmann", 1000));
		abtTest.hinzufuegen(new Arbeitskraft("004", "Schmidt", 1000));
		
		
		abtEntwicklung.druckeArbeitskraefte();
		abtTest.druckeArbeitskraefte();
		
	}

}
