package Interview;

public class ReturnTypeClass2 {

	int m3() {
		System.out.println("m1");
		m4();
		String output = ReturnTypeClass1.display();
		return output.length();
		//return ReturnTypeClass1.display().length();
	}
	
	void m4() {
		System.out.println("m2");
		
	}
	
	static String display() {
		System.out.println("Hello");
		String temp = "Aditya";
		return temp;
		
	}

}
