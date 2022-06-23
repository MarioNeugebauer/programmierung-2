package demo101.innerouter;

class OuterClass {
	private int outerNumber;
	private InnerClass innerClass;
	class InnerClass {
		int innerNumber;
		public InnerClass(int number) {
			innerNumber=number;
			innerClass=this;
		}
		private void innerMethod1() {
			System.out.println("outerNumber="+outerNumber);
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
