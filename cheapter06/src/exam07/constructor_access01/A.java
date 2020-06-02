package exam07.constructor_access01;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("String");

	public A(boolean b) {
	}

	A(int b) {
		
	}

	private A(String s) {
	}
}
