package basic;

public class nonstatic {
	
	int x=10;
	String name="Aditya";
	int z=1000;
	static String name1="StaticName";
	
	
	void m1() {
		System.out.println(x);
		System.out.println(name);
	
	}
	
	void m2() {
		m1();
		System.out.println("in m2 method");
		System.out.println(z);
		nonstatic.m4();
	}
	
	static void m3() {
		 String name="Aditya";
		 int a =10;
		 System.out.println("in m1 method");
		}
	

	static void m4() {
		System.out.println(nonstatic.name1);
		System.out.println("in m2 method");
	}
	
	public static void main(String[] args) {
		nonstatic ns = new nonstatic();
		ns.m2();
	}
	
	
}
