package demo000;

public class RechnendesProgramm {
	public static void main(String[] args) {
		
		/*
		final double PI = 3.14159265359;
		final int KONSTANTE1 = 23;
		final int KONSTANTE2 = 42;
		
		boolean a=true, b=false, c;
		c=a||b; // c = a ODER b

		boolean d, e;
		int zahl1=10, zahl2=11;
		
		d = zahl1==zahl2;
		e = zahl1 <= zahl2;
		
		int zahl3=42, zahl4, zahl5, zahl6;
		zahl4=zahl3/10;
		zahl5=zahl3%10;
		zahl6=zahl4+zahl5;
		
		// Casten von kleinem Datentyp in grossen Datentyp
		int einint=1234;
		long einlong;
		einlong=einint;
		
		
		int intzahl1, intzahl2;
		long longzahl1=123_456_781_234l;
		long longzahl2=1234l;
		intzahl1=(int)longzahl1; // Datenverlust
		intzahl2=(int)longzahl2; // Erfolg
		
		
		
		int a2=10;
		int b2=30;
		int c2=a2+b2;
		System.out.println("a2="+a2+"\tb2="+b2+"\tc2="+c2);
		
		
		if(zahl1==10) {
			System.out.println("gleich 10");
		} else if(zahl1<10) {
			System.out.println("kleiner 10");
		} else {
			System.out.println("groesser 10");
		}
		
		switch (zahl1) {
		case 9:
			System.out.println("Wert ist 9");
			break;
		case 10:
			System.out.println("Wert ist 10");
			break;
		case 11:
			System.out.println("Wert ist 11");
			break;
		default:
			System.out.println("Wert ist kleiner 9 oder groesser als 11");
			break;
		}
		
		
		for(int i=0; i<10; i++) {
			System.out.println("i="+i);
		}

		int j=10;
		while(j>0) {
			System.out.println("j="+j);
			j--;
		}

		int k=0;
		int k_quadrat;
		do {
			k_quadrat=k*k;
			System.out.println("k*k="+k_quadrat);
		} while(k_quadrat<20);
		
		
		int n=10;
		double[] feldMitDoubleWerten = new double[n];
		for(int i=0; i<10; i++) {
			feldMitDoubleWerten[i]=Math.random();
		}

		for(int i=0; i<10; i++) {
			System.out.println("feldMitDoubleWerten["+i+"]="+feldMitDoubleWerten[i]);
		}
		
		*/
		
		
		boolean ergebnis = istPrimzahl(23);
		
		
		int arr[] ={3,60,35,2,45,320,5}; 
		System.out.println("Feld vor Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubblesort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Feld nach Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
	}
	
	public static boolean istPrimzahl(int zahl) {
		if(zahl<2) { // die 1 ist keine Primzahl
			return false;
		}
		for(int teiler=2; teiler*teiler <= zahl; teiler++) {
			if(zahl%teiler==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void bubblesort(int[] feld) {
		int feldlaenge = feld.length; // Laenge des Feldes ermitteln  
		int temp = 0;  
		for(int i=0; i < feldlaenge; i++){  
			for(int j=1; j < (feldlaenge-i); j++){  
				if(feld[j-1] > feld[j]){  
					// Elemente tauschen
					temp = feld[j-1];  
					feld[j-1] = feld[j];  
					feld[j] = temp;  
				}  

			}  
		} 
	}
	
	
}
