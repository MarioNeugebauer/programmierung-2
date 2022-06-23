package demo101.innerouterstatic;

class OuterClass {
	private int outerNumber;
	private static InnerClass innerClass;
	static class InnerClass {
		int innerNumber;
		public InnerClass(int number) {
			innerNumber=number;
			innerClass=this;
		}
		private void innerMethod1() {
			// nicht ausfuehrbar, weil static InnerClass
			// System.out.println("outerNumber="+outerNumber);
			System.out.println("innerNumber="+innerNumber);
		}
	}
	public OuterClass(int number) {
		outerNumber=number;
	}
	public void outerMethod() {
		System.out.println("outerNumber="+outerNumber);
		innerClass.innerMethod1();
	}
}