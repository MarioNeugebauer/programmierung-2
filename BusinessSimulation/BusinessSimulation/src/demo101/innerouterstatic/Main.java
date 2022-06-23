package demo101.innerouterstatic;

import demo101.innerouterstatic.OuterClass.InnerClass;

public class Main {

	public static void main(String[] args) {
		OuterClass outer1 = new OuterClass(1);
		OuterClass.InnerClass innerStatic = new InnerClass(11);
		outer1.outerMethod();
		
		OuterClass outer2 = new OuterClass(2);
		outer2.outerMethod();
	}

}
