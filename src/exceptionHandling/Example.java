package exceptionHandling;

public class Example {
	
	void m1(int x) {
		try {
		System.out.println("hi");
		int ans= 10/x;
		System.out.println(ans);
		System.out.println(1);
		first f=new first();
		//first f=null;
		System.out.println(2);
		f.m2();
		System.out.println("Techno");
	}catch(NullPointerException ne) {
		System.out.println("Printing Null pointer execption");
	}
		catch(ArithmeticException ae) {
		System.out.println(4 );
	}
		System.out.println("aaaaaaaa");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		new Example().m1(10);
		System.out.println("End");
	}

}
