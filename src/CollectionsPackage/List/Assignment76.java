//Remove all the duplicate values from the list. 
package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment76 {
	void removeDuplicateValues(ArrayList<String>input) {
		for(int index=0;index<input.size();index++) {
			String indexValue=input.get(index);
			if(input.indexOf(indexValue)!=input.lastIndexOf(indexValue)) {
				input.remove(input.lastIndexOf(indexValue));
			}
		}
		System.out.println(input);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> input= new <String> ArrayList(Arrays.asList("Techno", "Credits", "Techno", "Hi", "Hello", "Pune", "Hi"));
		System.out.println(input);
		new Assignment76().removeDuplicateValues(input);
 	}

}
