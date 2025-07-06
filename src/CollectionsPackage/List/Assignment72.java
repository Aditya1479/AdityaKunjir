//Assignment-72 - Write a method to return list of names having frequency more than 1 from given ArrayList.

package CollectionsPackage.List;

import java.util.ArrayList;

public class Assignment72 {
	
	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
		ArrayList<String> targetList = new ArrayList<String>();
		for(int i=0; i<listOfNames.size();i++) {
			String name= listOfNames.get(i);
			if(listOfNames.indexOf(name)!=listOfNames.lastIndexOf(name) && !targetList.contains(name) ) {
				targetList.add(name);
			}
		}
		
		return targetList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ListOfNames = new ArrayList();
		ListOfNames.add("Aditya");
		ListOfNames.add("Mukund");
		ListOfNames.add("kunjir");
		ListOfNames.add("Hetal");
		ListOfNames.add("kunjir");
		
		
		
		ArrayList<String> outputList=new Assignment72().getUniqueNameList(ListOfNames);
		System.out.println(outputList);
		
	}

}
