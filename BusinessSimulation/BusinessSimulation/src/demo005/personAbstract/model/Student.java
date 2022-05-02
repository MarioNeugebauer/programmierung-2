package demo005.personAbstract.model;

public class Student extends Person {

	private String studiengruppe;
	
	public Student(String firstName, String lastName, String studiengruppe) {
		super(firstName, lastName);
		this.studiengruppe=studiengruppe;
	}

	@Override
	protected void printAusweis() {
		System.out.println("Studierendenausweis:");
		System.out.println("Name: "+lastName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Studiengruppe: "+studiengruppe);
	}

}
