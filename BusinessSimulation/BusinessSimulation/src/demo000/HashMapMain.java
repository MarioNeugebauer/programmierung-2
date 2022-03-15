package demo000;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
	    // Objekt der Klasse HashMap erzeugen
	    HashMap<String, String> landHauptstadt = new HashMap<String, String>();

	    // Schluessel-Wert-Paare hinzufuegen
	    landHauptstadt.put("England", "London");
	    landHauptstadt.put("Deutschland", "Berlin");
	    landHauptstadt.put("Norwegen", "Oslo");
	    landHauptstadt.put("USA", "Washington DC");
	    landHauptstadt.put("Frankreich", "Paris");
	    System.out.println(landHauptstadt);
	}
}
