package CollectionsPackage.List;

import java.util.ArrayList;

public class ArrayListex1 {
	
	public static void main(String[] args) {
		
	ArrayList a1 =new ArrayList();
	a1.add(10);
	a1.add("Aditya");
	a1.add('Z');
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.get(1));
	System.out.println(a1.get(a1.size()-1));
	System.out.println(a1.isEmpty());
	
	//Will add only String values
	ArrayList<String> a2 =new ArrayList();
	a2.add("Aditya");
	System.out.println(a2);
	
	//will add al heterogeneous values.
	ArrayList<Object> a3 =new ArrayList();
	a3.add("Aditya");
	a3.add(10);
	System.out.println(a3);
	
	ArrayList<String> ListOfNames= new ArrayList();
	ListOfNames.add("Aditya");
	ListOfNames.add("Mukund");
	ListOfNames.add("kunjir");
	for(int i=0;i<=ListOfNames.size()-1;i++) {
		System.out.println(ListOfNames.get(i));
	}
	System.out.println(ListOfNames);
	}
	
	
	
}
