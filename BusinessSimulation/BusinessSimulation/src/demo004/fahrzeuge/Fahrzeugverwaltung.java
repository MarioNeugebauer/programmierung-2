package demo004.fahrzeuge;

import demo004.fahrzeuge.model.Auto;
import demo004.fahrzeuge.model.Fahrrad;
import demo004.fahrzeuge.model.Fahrradtyp;
import demo004.fahrzeuge.model.Fahrzeug;
import demo004.fahrzeuge.model.Motorart;

public class Fahrzeugverwaltung {

	public static void main(String[] args) {
		
		Fahrrad einFahrrad = new Fahrrad(2, "ABike", 13.0f, 3, Fahrradtyp.CITYBIKE, "Bike003");
		Fahrrad nochEinFahrrad = new Fahrrad(2, "CBike", 11.0f, 15, Fahrradtyp.MOUNTAINBIKE, "Bike023");
		
		Auto einAuto = new Auto(4, "CarProducer", 1800.0f, Motorart.ELEKTRO, 90.0f, 500.0f, "Car101");
		Auto nochEinAuto = new Auto(4, "CarProducer", 1800.0f, Motorart.ELEKTRO, 90.0f, 500.0f, "Car201");
		
		Fahrzeug einFahrzeug = new Auto(4, "CarProducer", 1500.0f, Motorart.ELEKTRO, 90.0f, 500.0f, "Car221");
		Fahrrad nochEinFahrzeug = new Fahrrad(2, "DBike", 11.0f, 15, Fahrradtyp.MOUNTAINBIKE, "Bike223");
		
		
		System.out.println(einFahrrad);
		System.out.println(nochEinFahrrad);
		System.out.println(einAuto);
		System.out.println(nochEinAuto);
		
		System.out.println(einFahrzeug);
		System.out.println(nochEinFahrzeug);

		if(einFahrzeug instanceof Fahrrad) {
			System.out.println("Variable einFahrzeug ist vom Typ Fahrrad");
			System.out.println(einFahrzeug);
			// ggf. weitere spezielle Logik für Fahrrad 
		} else if(einFahrzeug instanceof Auto) {
			System.out.println("Variable einFahrzeug ist vom Typ Auto");
			System.out.println(einFahrzeug);
			// ggf. weitere spezielle Logik für Auto 
		}
		
		
	}

}
