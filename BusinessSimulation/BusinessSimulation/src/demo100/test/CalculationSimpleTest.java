package demo100.test;

import demo100.persistence.impl.InMemoryResultRepository;
import demo100.service.Calculation;

public class CalculationSimpleTest {
	public static void main(String[] args) {
		// Vorbereiten der Stubs
		InMemoryResultRepository testRepositoryInMemory = new InMemoryResultRepository();

		// zu testendes Modul instanziieren
		Calculation calc = new Calculation(testRepositoryInMemory);

		// Test durchführen
		int addResult = calc.addition(2, 2);
		// Sollwert festlegen
		int addResultTarget = 4;
		
		// Ergebnis bewerten
		if(addResult!=addResultTarget) {
			System.out.println("Fehler in calc.addition. Sollwert: "+addResultTarget+" weicht vom tatsächlichen Wert "+addResult+" ab.");
		} else {
			System.out.println("calc.addition ok");
		}
		
		// Ergebnis bewerten
		if(!testRepositoryInMemory.getIntResults().contains((Integer)addResultTarget)) {
			System.out.println("Fehler in Repository. Ergebnis "+addResultTarget+" ist nicht in Repository enthalten.");
		} else {
			System.out.println("Repository ok");
		}
	}
}
