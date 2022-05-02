package demo005.personAbstract.model;

public class Mitarbeiter extends Person {
	
	private String fakultaet;

	public Mitarbeiter(String firstName, String lastName, String fakultaet) {
		super(firstName, lastName);
		this.fakultaet=fakultaet;
	}

	@Override
	protected void printAusweis() {
		System.out.println("Mitarbeiterausweis:");
		System.out.println("Name: "+lastName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Fakultaet: "+fakultaet);
	}
}
