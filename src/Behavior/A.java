package Behavior;

public class A {
	private int x=10;
	private String name="techno";
	
	void display(int num) {
		num=num+10;
		System.out.println(name+ " -> " +x);
	}
	void display() {
		System.out.println(name);
	}
}
