//Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.
package CollectionsPackage.List;

import java.util.ArrayList;

public class Assignment78 {
	void replaceElement(ArrayList<String>input) {
		for(int index=0;index<input.size();index++) {
			if (input.get(index).equals("Gaurang")) {
	            input.set(index, "Rahul");
	        }
		}
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listOfNames = new ArrayList<String>();

		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Gaurang");
		listOfNames.add("Onkar");
		listOfNames.add("Jay"); // Techno // Jay
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");
		System.out.println(listOfNames);
		new Assignment78().replaceElement(listOfNames);
	}

}
