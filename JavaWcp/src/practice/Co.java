package practice;

public class Co {
	public static void main(String[] args) {
		A a = new A() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(a.hello());
	}
}
