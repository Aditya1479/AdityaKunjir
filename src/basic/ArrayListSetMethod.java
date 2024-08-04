package basic;

import java.util.ArrayList;

public class ArrayListSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> A1 = new ArrayList<String>();
		A1.add("sakshi");
		A1.add("Nivedita");
		A1.add("Swati");
		A1.add("Nivedita");
		A1.add("Onkar");
		A1.add("Jay");
		A1.add("sakshi");
		A1.add("Nivedita");
		System.out.println(A1);
		System.out.println(A1.set(2, "NewSwati"));
		System.out.println(A1);
		System.out.println(A1.size());
		A1.add(8, "EightIndex");
		System.out.println(A1);
	}

}
