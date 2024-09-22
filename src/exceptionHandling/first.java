package exceptionHandling;

public class first {
	
	void m1(int x) {
		System.out.println(1);
		System.out.println(2);
		try {
		int ans= 10/x;
		x--;
		ans=10/x;
		System.out.println("now answer is" +ans);
		System.out.println(" Answer is "+ans);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
			ae.printStackTrace(); 
			System.out.println("Catch block handles the error");
		}
		finally {
			
		}
		System.out.println(4);
		System.out.println(5);
	}
	
	void m2() {
		System.out.println("First m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		first f = new first();
		f.m1(10);
		System.out.println("Hello");
	}

}
