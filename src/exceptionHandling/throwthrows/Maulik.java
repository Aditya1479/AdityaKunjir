package exceptionHandling.throwthrows;

public class Maulik {

	void m1() {
		System.out.println("Maulik m1");
		try {
			new krishna().processData(1500);
			System.out.println(3);
		} catch (ArithmeticException ae) {
			System.out.println("Handled");
		}
		System.out.println("done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Maulik().m1();
		System.out.println("end");
	}

}
