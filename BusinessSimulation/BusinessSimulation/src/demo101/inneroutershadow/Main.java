package demo101.inneroutershadow;

public class Main {

    public static void main(String... args) {
        Outer outer = new Outer();
        Outer.InnerClass inner = outer.new InnerClass();
        inner.methodInFirstLevel(23);
    }

}
