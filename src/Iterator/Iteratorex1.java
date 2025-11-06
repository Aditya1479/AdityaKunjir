package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iteratorex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setOfNames= new LinkedHashSet<String>(
				Arrays.asList("Techno","credits","TechnoCredits","hiii"));
		
		Iterator<String> itr=setOfNames.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			if(name.length()>10) {
				itr.remove();
		}
		}
		System.out.println(setOfNames);
		/*
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 * System.out.println(itr.next());
		 */
		
	}

}
