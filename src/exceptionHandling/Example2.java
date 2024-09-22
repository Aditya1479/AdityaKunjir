package exceptionHandling;

public class Example2 {
	void m1() {
		int y=1;
		try {
			int x =10/--y;
			y++;
			System.out.println(x);
		}
		catch(ArithmeticException ae) {
			System.out.println("Hello");
			int ans= 10/y--;
			System.out.println(ans);
		}
		finally {
			System.out.println("Hi");
			System.out.println("Credits");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example2().m1();
	}

}
