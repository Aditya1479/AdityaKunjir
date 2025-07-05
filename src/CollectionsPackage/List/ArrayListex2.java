package CollectionsPackage.List;

import java.util.ArrayList;

public class ArrayListex2 {
	
	void verifListOfNames(ArrayList<String> listofNames) {
		boolean flag= false;
		for(int index=0; index<listofNames.size();index++) {
			String name=listofNames.get(index);
			if(name.equals("Hetal")) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Name found");
		}
		else {
			System.out.println("Name not Found");
		}
	}
	
	
	void verifListOfNamesbyMethod(ArrayList<String> listofNames) {
		boolean flag= listofNames.contains("Hetal");
		if(flag) {
			System.out.println("Name Found");
		}else {
			System.out.println("Name Not Found");
		}
	}
	
	
	public static void main(String[] args) {
		
	ArrayList<String> ListOfNames= new ArrayList();
	ListOfNames.add("Aditya");
	ListOfNames.add("Mukund");
	ListOfNames.add("kunjir");
	ListOfNames.add("kunjir");
	ListOfNames.add("Hetal");
	//used ArrayList Contains() to identify the element
	System.out.println(ListOfNames.contains("Aditya1"));
	System.out.println(ListOfNames);
	//used with classic use of array
	new ArrayListex2().verifListOfNames(ListOfNames); 
	new ArrayListex2().verifListOfNamesbyMethod(ListOfNames); 
	}
	
	
	
}
