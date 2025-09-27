package basic;

public class Staticclass {
	static String name1="Kunjir";
	static void m1() {
	 String name="Aditya";
	 int a =10;
	 System.out.println("in m1 method");
	}
	
	static void m2() {
		Staticclass.m1();
		System.out.println(Staticclass.name1);
		System.out.println("in m2 method");
	}
	 
	public static void main(String[] args) {
		Staticclass sc= new Staticclass();
		sc.m2();
	}
}	


