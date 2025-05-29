package exceptionHandling;

import java.io.FileNotFoundException;

public class child extends parent{
	
	
	void m1() throws NullPointerException {
		
	}
	
	void m2() throws ArithmeticException{
		
	}
	
	void m3() throws ArrayIndexOutOfBoundsException{
		
	}

	
	void m4() throws FileNotFoundException{
		// parent class m4 methods does not throwing any checked exception so child is also not able
		//to throw any checked exception
	}
	
}
