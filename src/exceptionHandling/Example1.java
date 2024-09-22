package exceptionHandling;

public class Example1 {
	
	void m1(int y) {
		try {
			System.out.println(1);
			int x= 10/y;
			System.out.println(x);
			System.out.println(2);
		}
		
		catch(NullPointerException ne) {
			System.out.println(" in Catch block");
		}
		
		finally {
			System.out.println("In Finally");
		}
		System.out.println(3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	new Example1().m1(0);
	System.out.println("end");
	}

}
