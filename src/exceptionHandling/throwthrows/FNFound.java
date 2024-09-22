package exceptionHandling.throwthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FNFound {
	
	void m1() throws FileNotFoundException {
		try {
		File file = new File("d:/mnk.txt");
		FileInputStream stream = new FileInputStream(file);
		}
		catch(FileNotFoundException Fe) {
			System.out.println("Hi");
			File file = new File("d:/mnk11.txt");
			FileInputStream stream = new FileInputStream(file);
		}
		System.out.println("Hello");
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Start");
		FNFound f = new FNFound();
		f.m1();
		System.out.println("done");
	}

}
