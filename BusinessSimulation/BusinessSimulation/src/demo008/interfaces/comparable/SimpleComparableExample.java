package demo008.interfaces.comparable;

public class SimpleComparableExample {

	public static void main(String[] args) {
		
		Integer x = 4;
		Integer y = 7;
		Integer z = 7;
		
		int compareErgebnis1 = x.compareTo(y);
		int compareErgebnis2 = y.compareTo(x);
		int compareErgebnis3 = y.compareTo(z);
		
		System.out.println("x.compareTo(y) : "+compareErgebnis1);
		System.out.println("y.compareTo(x) : "+compareErgebnis2);
		System.out.println("y.compareTo(z) : "+compareErgebnis3);
		

	}

}
