package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListex8 {
		
	void add(int...num) {
		//You can give number of arguments to method no specific/Limit is there
	}
	
	void m1() {	
		List<String> al1 = new ArrayList<String>(Arrays.asList("Techno"));
		al1.add("Aditya");
		al1.add("Kunjir");
		System.out.println(al1);
		
		ArrayList<String> al2= new ArrayList<String>(al1);
		al2.add("Credits");
		System.out.println(al2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListex8 a8= new ArrayListex8();
		a8.m1();
		a8.add(1,4,334,121);
	}

}
