package Contructor;

public class A {
	
	A(){
		super();
		//super is written by compiler to call the parent class default contructor
		System.out.println("1");
	}
	
	A(int x){
		super();
		//super is written by compiler to call the parent class default contructor
		System.out.println("2");
	}
	
	void m1(int x) {
		System.out.println("A m1");
	}

}
