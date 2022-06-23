package demo101.inneroutershadow;

public class Outer {
	public int x = 0;

    class InnerClass {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + Outer.this.x);
        }
    }
}
