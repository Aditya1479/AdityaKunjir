package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListex7 {
	
	void processData(ArrayList<String> listOfNames) {
		while(listOfNames.size()>0) {
			String name=listOfNames.get(0);
			int orgLength=listOfNames.size();
			while(listOfNames.contains(name)) {
				listOfNames.remove(name);
			}
			int newLength=listOfNames.size();
			System.out.println(name+ "---> " +(orgLength-newLength));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListex7 a7	= new ArrayListex7();
		//ArrayList<String>arr= new ArrayList(Arrays.asList("Jay","Jay","Sakshi","Roshni","Roshni","Roshni"));
		String[] arr ={"Jay","Jay","Sakshi","Roshni","Roshni","Roshni"};
		ArrayList<String> input= new ArrayList<String>(Arrays.asList(arr));
		a7.processData(input);
	}

}
