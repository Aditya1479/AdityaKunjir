package exceptionHandling;

import java.io.FileNotFoundException;

import javax.security.auth.login.AccountNotFoundException;

public class child extends parent {

	void m1() throws NullPointerException {

	}

	void m2() throws ArithmeticException {

	}

	void m3() throws ArrayIndexOutOfBoundsException {

	}

	//void m4() throws FileNotFoundException {
		// parent class m4 methods does not throwing any checked exception so child is
		// also not able
		// to throw any checked exception
//	}

	void m5() throws FileNotFoundException {

	}

	void m6() {

	}

//	void m7() throws ClassNotFoundException {
		//Parent class M7 method throws FileNotFoundExcpetion and child class Method throws
		//ClassNotFoundException which is not allowed for checked Exception
	//}
	
	void m8() throws FileNotFoundException{
		
	}
	
}
