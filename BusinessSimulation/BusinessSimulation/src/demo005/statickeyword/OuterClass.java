package demo005.statickeyword;

public class OuterClass {
	
	public static class NestedClass {
		public void fooMethod() {
			System.out.println("Ausgabe der fooMethod in NestedClass");
		}
	}
	
	public static void main(String args[]) {
		OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
		nestedClass.fooMethod();
	}
	
}
