package demo005.personAbstract.model;

public abstract class Person {
	protected String firstName;
	protected String lastName;
	
	// Konstruktor ist protected und kann nur von Unterklasse
	// in gleichem package aufgerufen werden
	protected Person(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void dokumentDrucken() {
		System.out.println("====================");
		printAusweis();
		System.out.println("====================");
	}
	
	protected abstract void printAusweis();
}
