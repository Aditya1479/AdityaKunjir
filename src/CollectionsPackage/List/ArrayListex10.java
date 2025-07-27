package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList("Aditya","Mukund","Kunjir","Radhika","Mukund"));
		
//		while(listOfName.contains("Mukund")) {
//			listOfName.remove("Mukund");
//		}
		
		ArrayList<String> RemoveList= new ArrayList();
		RemoveList.add("Kunjir");
		listOfName.removeAll(RemoveList);// Removes all elements from listofName which are present in RemoveList 
		
		
		System.out.println(listOfName);
	}

}
