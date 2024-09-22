//In this example finally blocks consist the exception

package exceptionHandling;

public class finallyBlock {
	
	void m1() {
		int y=1;
		try {
			int x= 10/y;
			System.out.println("Try Block value " +x);
			y--;
		}
		catch(ArithmeticException ae ) {
			System.out.println("Arithematic Exception");
		}
		finally {
			try {
			int ans = 10/y;
			System.out.println(ans);
			}catch(ArithmeticException ae) {
				System.out.println("Handled");
			}
			System.out.println("techno");
		}
		System.out.println("Credits");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finallyBlock f = new finallyBlock();
		f.m1();
	}

}
