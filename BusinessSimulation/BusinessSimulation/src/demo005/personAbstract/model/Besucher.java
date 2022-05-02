package demo005.personAbstract.model;

import java.time.LocalDate;

public class Besucher extends Person {
	
	private LocalDate besuchstag;

	public Besucher(String firstName, String lastName, LocalDate besuchstag) {
		super(firstName, lastName);
		this.besuchstag=besuchstag;
	}

	@Override
	protected void printAusweis() {
		System.out.println("Besucherausweis:");
		System.out.println("Name: "+lastName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Datum: "+besuchstag);
	}
	
	
}
