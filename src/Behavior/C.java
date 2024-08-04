package Behavior;

public class C extends B{
	int x=100;
	void display() {
		System.out.println("Credits");
	}
	
	public static void main(String[] args) {
		B b = new C();
		b.display(10);
		b.display();
		System.out.println(b.x);
	}

}
