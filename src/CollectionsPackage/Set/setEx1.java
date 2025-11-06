package CollectionsPackage.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class setEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setOfNames= new LinkedHashSet<String>(Arrays.asList("Techno","credits","TechnoCredits","hiii"));
	//ConcurrentModificationException disoplayed when user try to modify the set value using enhanced for loop.
		for(String names:setOfNames) {
			if(names.length()>10) {
				setOfNames.remove("TechnoCredits");
			}
			System.out.println(names);
		}
		System.out.println(setOfNames);
		}

}
