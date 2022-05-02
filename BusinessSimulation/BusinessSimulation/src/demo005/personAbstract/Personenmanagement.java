package demo005.personAbstract;

import java.time.LocalDate;
import java.util.ArrayList;

import demo005.personAbstract.model.Besucher;
import demo005.personAbstract.model.Mitarbeiter;
import demo005.personAbstract.model.Person;
import demo005.personAbstract.model.Student;

public class Personenmanagement {

	public static void main(String[] args) {
		
		ArrayList<Person> personenListe = new ArrayList<Person>();
		
		// eine Instanz von Person kann nicht gebildet werden => führt zu einem Fehler
		// Person einePerson = new Person("Müller", "Max");
		
		personenListe.add(new Student("Müller", "Max", "1234"));
		personenListe.add(new Student("Meier", "Martha", "1234"));
		personenListe.add(new Mitarbeiter("Schulz", "Sven", "Informatik/Mathematik"));
		personenListe.add(new Mitarbeiter("Scheibner", "Siegfried", "Informatik/Mathematik"));
		personenListe.add(new Besucher("Gast", "Gustav", LocalDate.now()));
		
		for (Person person : personenListe) {
			person.dokumentDrucken();
		}
		
	}
}
