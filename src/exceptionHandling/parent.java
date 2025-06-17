package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class parent {

	// Unchecked exception dont have any overriding rules because they are not
	// checked at compile
	// time m1 to m3 methods are unchecked exception

	void m1() throws NullPointerException {

	}

	void m2() throws NullPointerException {

	}

	void m3() {

	}

	void m4() {

	}

	void m5() throws FileNotFoundException {

	}

	void m6() throws FileNotFoundException {

	}

	void m7() throws FileNotFoundException {

	}

	void m8() throws IOException{
		
	}
}
