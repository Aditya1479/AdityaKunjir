package Interview;

import java.util.ArrayList;

public class clientStudent {
	
	public static void main(String[] args) {
		student s1= new student(1,"aditya","pune",90.00,'A');
		student s2= new student(1,"mukund","kolhapur",80.00,'b');
		student s3= new student(1,"rahul","baramati",92.00,'A');
		student s4= new student(1,"aaa","satara",80.50,'b');
		ArrayList<student> listOfStudents= new ArrayList<student>();
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		
		System.out.println(listOfStudents.size());
		student std1 = listOfStudents.get(0);
		System.out.println(std1);
		System.out.println(listOfStudents);
	}
		
		
}
