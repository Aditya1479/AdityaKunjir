package CollectionsPackage.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class hashSetex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet
		Set<String> listOfNames= new <String> HashSet();
		listOfNames.add("denish");
		listOfNames.add("Aditya");
		listOfNames.add("Shurtika");
		listOfNames.add("Sayali");
		listOfNames.add("Aditya");
		listOfNames.add("Jay");
		listOfNames.add("Rahul");
		
		System.out.println(listOfNames.size());
		System.out.println(listOfNames);
		
		//LinkHashSet
		Set<Object> listOfNames1= new <Object> LinkedHashSet();
		listOfNames1.add("denish");
		listOfNames1.add("Aditya");
		listOfNames1.add("Shurtika");
		listOfNames1.add("Sayali");
		listOfNames1.add("Aditya");
		listOfNames1.add("Jay");
		listOfNames1.add("Rahul");
		
		System.out.println(listOfNames1.size());
		System.out.println(listOfNames1);
		
		ArrayList <String> a1= new <String> ArrayList(listOfNames1);
		System.out.println(a1.get(0));
		System.out.println(a1.get(a1.size()-1));
		
		String firstName="";
		String LastName="";
		
		for(String names :a1 ) {
			if(firstName.equals("")) {
				firstName=names;
			}else
				LastName=names;	
		}
		System.out.println(firstName);
		System.out.println(LastName);
		
		
		//TreeSet
		Set<String> listOfNames2= new <String> TreeSet();
		listOfNames2.add("denish");
		listOfNames2.add("Aditya");
		listOfNames2.add("Shurtika");
		listOfNames2.add("Sayali");
		listOfNames2.add("Aditya");
		listOfNames2.add("Jay");
		listOfNames2.add("Rahul");
		listOfNames2.add("10");
		System.out.println(listOfNames2.size());
		System.out.println(listOfNames2);
		
		ArrayList <String> a2= new <String> ArrayList(listOfNames2);
		System.out.println(a2.get(0));
		System.out.println(a2.get(a2.size()-1));
		
		}

}
