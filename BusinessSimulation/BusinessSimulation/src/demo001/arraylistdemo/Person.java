package demo001.arraylistdemo;

public class Person {

	private int nr; 
	private String lastname;
	private String firstname;
	
	public Person(int nr, String lastname, String firstname) {
		this.nr=nr;
		this.lastname=lastname;
		this.firstname=firstname;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}
