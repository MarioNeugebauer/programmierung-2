package demo101.innerouter;

public class Main {

	public static void main(String[] args) {
		
		OuterClass outer1 = new OuterClass(1);
		OuterClass.InnerClass inner1 = outer1.new InnerClass(11);
		outer1.outerMethod();
		
		OuterClass outer2 = new OuterClass(2);
		OuterClass.InnerClass inner2 = outer2.new InnerClass(22);
		outer2.outerMethod();
	}

}
