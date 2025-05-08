package ProgrammigTest;

public class booleanex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = false;
		boolean b4 = false;
		//true || true  false||false 
		if( b1 || b2 && b3 ||b4) { //Right to Left evaluation
			System.out.println("hi");
		}
		else {
			System.out.println("hello");
		}
	}

}
