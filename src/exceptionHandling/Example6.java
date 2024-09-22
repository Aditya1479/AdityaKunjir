package exceptionHandling;

public class Example6 {
	void m1(int y) {
	try {
		System.out.println("hi");
		try {
			int x = 10 / y;
			System.out.println(x);
		} catch (ArithmeticException ne) {
			System.out.println("ok");
		} finally {
			System.out.println("Good");
		}
		System.out.println("Hello");
	} catch (ArithmeticException ae) {
		System.out.println("techno");
	} finally {
		System.out.println("credits");
	}
	System.out.println("Done");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example6().m1(0);
	}

}
