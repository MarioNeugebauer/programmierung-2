package demo100.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import demo100.persistence.ResultRepository;
import demo100.persistence.impl.InMemoryResultRepository;

class CalculationTest {

	@Test
	void testAddition() {
		// Vorbereiten der Stubs
		ResultRepository testRepository = new InMemoryResultRepository();

		// zu testendes Modul instanziieren
		Calculation calc = new Calculation(testRepository);
		
		// Tests durchführen
		assertEquals(4, calc.addition(2,2), "Addition");
	}
	
	@Test
	void testRepositoryAddition() {
		// Vorbereiten der Stubs
		InMemoryResultRepository inMemoryTestRepository = new InMemoryResultRepository();
		
		// zu testendes Modul instanziieren
		Calculation calc = new Calculation(inMemoryTestRepository);
		
		// Sollwert des Ergebnisses
		Integer targetValue = 4;
		
		// Tests durchführen
		assertEquals(targetValue, calc.addition(2,2), "Addition");
		assertTrue(inMemoryTestRepository.getIntResults().contains(targetValue), "Sollwert ist nicht in Repository enthalten.");
	}

	@Test
	void testMultiplikation() {
		ResultRepository testRepository = new InMemoryResultRepository();
		Calculation calc = new Calculation(testRepository);
		assertEquals(4, calc.multiplikation(2,2), "Addition");
	}

}
