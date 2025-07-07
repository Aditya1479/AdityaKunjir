//Remove all occurances of given name from ArrayList.

package CollectionsPackage.List;

import java.util.ArrayList;

public class Assignment77 {
	void removeSpecificElement(ArrayList<String>input) {
		for(int i=0;i<input.size();i++) {
			while(input.contains("Gaurang")) {
				input.remove("Gaurang");
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
		new Assignment77().removeSpecificElement(listOfNames);
	}

}
