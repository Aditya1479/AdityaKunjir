package exceptionHandling;

public class Example7 {
	void m1(int y) {
		try {
			try {
				System.out.println("hi");
				try {
					int x = 10 / y;
					System.out.println(x);
				} catch (ArrayIndexOutOfBoundsException ne) {
					System.out.println("ok");
				} finally {
					System.out.println("Good");
				}
				System.out.println("Hello");
			} catch (StringIndexOutOfBoundsException ae) {
				System.out.println("techno");
			} finally {
				System.out.println("credits");
			}
			System.out.println("Done");
		} catch (ArithmeticException aa) {
			System.out.println("indian");
		}
		System.out.println("exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example7().m1(0);
		System.out.println("end");
	}

}
