//proopgate/handle the execpetion for FileInputStream
//m1() method is throwing checked exception and from m2(), m1() method is called so in m2() we need to either
//handle the exception or propagate it.
package exceptionHandling.throwthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class fileException2 {
	
	void m1() throws IOException{
		File file = new File("d:/a.txt");
		FileInputStream inputStream = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(inputStream);
	} 
	
	void m2() {
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("credits");
		}catch(IOException io) {
			System.out.println("IOexception");
		}catch(Exception e) {
			System.out.println("exception");
		}
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileException2 fe = new fileException2();
		fe.m2();
		System.out.println("end");
	}

}
