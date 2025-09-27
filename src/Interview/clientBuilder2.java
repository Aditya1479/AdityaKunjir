package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class clientBuilder2 {
	
	public static void main(String[] args) {
		
	
	Builder b1= new Builder("Kalpataru","pune",12,30);
	Builder b2= new Builder("Rohan","nagpur",8,45);
	Builder b3= new Builder("VJ","mumbai",18,20);
	
	List<Builder> listOfbuilder= new ArrayList<Builder>();
	listOfbuilder.add(b1);
	listOfbuilder.add(b2);
	listOfbuilder.add(b3);
	
	System.out.println(listOfbuilder);
	
	Collections.sort(listOfbuilder);
	//new yearsOfExperienceComparator Comparator class used directly for sorting
	Collections.sort(listOfbuilder, new yearsOfExperienceComparator());
	System.out.println("==========================");
	System.out.println(listOfbuilder);
	System.out.println("==========================");
	//new nameComparator() Comparator class used directly for sorting
	Collections.sort(listOfbuilder, new nameComparator());
	System.out.println(listOfbuilder);
	}
}
