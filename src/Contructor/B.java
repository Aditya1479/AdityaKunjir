package Contructor;

public class B extends A{
	
	B(){
		super();
		//super is written by compiler to call the parent class default contructor
		System.out.println("3");
	}
	
	B(int x){
		super();
		System.out.println("4");
	}
	void m1() {
		System.out.println("b m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m1();
	}

}
