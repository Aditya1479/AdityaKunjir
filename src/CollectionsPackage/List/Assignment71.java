//Assignment-71 : 1st Nov'2023
//Write a method to return unique list of names from given ArrayList.


package CollectionsPackage.List;

import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment71 {
	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> uniqueList = new ArrayList();

		for (int i = 0; i < listOfNames.size(); i++) {
			String name = listOfNames.get(i);
			if (listOfNames.indexOf(name) == listOfNames.lastIndexOf(name)) {
				uniqueList.add(name);
			}
		}
		return uniqueList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ListOfNames = new ArrayList();
		ListOfNames.add("Aditya");
		ListOfNames.add("Mukund");
		ListOfNames.add("kunjir");
		ListOfNames.add("Hetal");
		ListOfNames.add("kunjir");
		ArrayList<String> outputList= new Assignment71().getUniqueNameList(ListOfNames);
		System.out.println(outputList);
	}

}
