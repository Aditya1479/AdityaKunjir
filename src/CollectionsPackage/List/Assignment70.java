//Assignment-70 : 1st Nov'2023
//Write a method to print unique names from given ArrayList.

package CollectionsPackage.List;

import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment70 {
	void getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> uniqueList = new ArrayList();

		for (int i = 0; i < listOfNames.size(); i++) {
			String name = listOfNames.get(i);
			if (listOfNames.indexOf(name) == listOfNames.lastIndexOf(name)) {
				uniqueList.add(name);
			}
		}
		System.out.println(uniqueList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ListOfNames = new ArrayList();
		ListOfNames.add("Aditya");
		ListOfNames.add("Mukund");
		ListOfNames.add("kunjir");
		ListOfNames.add("Hetal");
		ListOfNames.add("kunjir");
		new Assignment70().getUniqueNameList(ListOfNames);
	}

}
