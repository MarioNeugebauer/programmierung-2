package demo001.arraylistdemo;

import java.util.ArrayList;

public class ArrayListMain2 {
	public static void main(String[] args) {
		ArrayList<Person> personenliste = new ArrayList<Person>();
		personenliste.add(new Person(1, "Müller", "Marius"));
		personenliste.add(new Person(2, "Schulze", "Sven"));
		personenliste.add(new Person(3, "Lehmann", "Lutz"));
		personenliste.add(new Person(4, "Schmitzke", "Sören"));
		
		System.out.println(personenliste);
	}
}
