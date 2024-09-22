package exceptionHandling;

public class Example4 {
	void m1() {
		int y=1;
		try {
			int x =10/y--;
			System.out.println(x);
			System.out.println("Hello");
			try {
				int ans= 10/y--;
				System.out.println(ans);
				}catch(ArithmeticException aw) {
					System.out.println("India");
				}
				finally {
					System.out.println("Pune");
				}
			System.out.println("Nice");
		}
		catch(ArithmeticException ae) {
			System.out.println("really!");
		}
		finally {
			System.out.println("Hi");
			System.out.println("Credits");
		}
		System.out.println("All good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example4().m1();
	}

}
