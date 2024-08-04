package Interview;

public class ReturnTypeClass1 {


	void m1() {
		System.out.println("m1");
	}
	
	void m2() {
		System.out.println("m2");
		m1();
	}
	
	static String display() {
		System.out.println("Hello");
		String temp = "Aditya";
		return temp;
		
	}

}
