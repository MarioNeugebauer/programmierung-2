package demo005.statickeyword;

public class SomeMain {

	public static void main(String[] args) {
				
		ClassWithStaticVariable obj1 = new ClassWithStaticVariable("abc", "123");
		ClassWithStaticVariable obj2 = new ClassWithStaticVariable("def", "456");
		
		System.out.println("Anzahl (obj1): "+obj1.anzahl);
		System.out.println("Anzahl (obj2): "+obj2.anzahl);
		
		obj1.anzahlAufWertSetzen(10);

		System.out.println("Anzahl nach setzen (obj1): "+obj1.anzahl);
		System.out.println("Anzahl nach setzen (obj2): "+obj2.anzahl);

	}

}
