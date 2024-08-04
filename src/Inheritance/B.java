package Inheritance;

public class B extends A {
	
	int y =30;
	int z= 40;
	
	void m2() {
		System.out.println("B m2");
	}
	
	void m3() {
		System.out.println("B m3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);
		a.m1();
		a.m2();
	    //a.m3();

	}

}
