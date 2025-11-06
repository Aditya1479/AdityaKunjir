package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment90Client {
	
	public static void main(String[] args) {
		
	
	
	Assignment90 as90 = new Assignment90("Aditya",1,90.00,"Pune");
	Assignment90 as91 = new Assignment90("Mukund",11,93.23,"Nashik");
	Assignment90 as92 = new Assignment90("Akankasha",1,78.00,"Mumbai");
	
	List<Assignment90> listOfStudents= new ArrayList<Assignment90>();
	listOfStudents.add(as90);
	listOfStudents.add(as91);
	listOfStudents.add(as92);
	System.out.println(listOfStudents);
	Collections.sort(listOfStudents);
	System.out.println(listOfStudents);
	}
}
