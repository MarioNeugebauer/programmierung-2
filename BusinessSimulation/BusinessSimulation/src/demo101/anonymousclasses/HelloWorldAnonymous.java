package demo101.anonymousclasses;

public class HelloWorldAnonymous {

	public void sayHello() {

		Greeting englishGreeting = new Greeting() {
			String name = "world";
			public void greet() {
				greetSomeone("world");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		};

		englishGreeting.greet();
		englishGreeting.greetSomeone("Fred");
	}
}
