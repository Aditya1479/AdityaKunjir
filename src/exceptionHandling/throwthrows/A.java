package exceptionHandling.throwthrows;

public class A {
	Maulik maulik;

	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println(1);
		maulik.m1();
		System.out.println(2);
	}

	void m2() {
		try {
			m1();
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("catch");
		}
		System.out.println(3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		try {
			a.m2();
		} catch (NullPointerException ne) {
			System.out.println("Handled");
		}
		System.out.println("end");

	}

}
