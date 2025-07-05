package CollectionsPackage.List;

import java.util.ArrayList;

public class ArrayListex4 {
	
	
	public static void main(String[] args) {
		
	ArrayList<String> ListOfNames= new ArrayList();
	ListOfNames.add("Aditya");
	ListOfNames.add("Mukund");
	ListOfNames.add("kunjir");
	ListOfNames.add("Hetal");
	
	System.out.println(ListOfNames);
	
	//adding element at specific index possible in ArrayList not in Array
	ListOfNames.add(2, "Magic");
	System.out.println(ListOfNames);
	
	
	}
	
	
	
}
