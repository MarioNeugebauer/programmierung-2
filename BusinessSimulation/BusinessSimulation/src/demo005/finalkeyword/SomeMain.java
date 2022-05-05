package demo005.finalkeyword;

public class SomeMain {

	public static void main(String[] args) {
		
		MyFinalClass eineFinalKlasse = new MyFinalClass(5);
		
		eineFinalKlasse.setAttribute(8);
		
		
		
		final MyFooClass instanzMyFooClass = new MyFooClass(1);
		
		instanzMyFooClass.setEineVariable(5);
		
		instanzMyFooClass = new MyFooClass(10);
		
		
	}

}
