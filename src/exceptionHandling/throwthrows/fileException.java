//proopgate/handle the execpetion for FileInputStream
//m1() method is throwing checked exception and from m2(), m1() method is called so in m2() we need to either
//handle the exception or propagate it.
package exceptionHandling.throwthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileException {
	
	void m1() throws FileNotFoundException {
		File file = new File("d:/a.txt");
		FileInputStream inputStream = new FileInputStream(file);
	}
	
	void m2() {
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
