package Interview;

public class Example {
	
	int x=10;
	static int y =20;
	
	void processdata() {
		x++;
		y++;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Example e1	= new Example();
		e1.processdata();
		e1.processdata();
		e1.processdata();
		e1.display();
		System.out.println("=========================");
		Example e2 = new Example();
		e2.processdata();
		e2.display();
	}

}
