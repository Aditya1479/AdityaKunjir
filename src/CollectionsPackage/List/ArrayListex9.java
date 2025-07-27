package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListex9 {
	
	void processData(ArrayList<Integer> listOfNames) {
		while(listOfNames.size()>0) {
			//int new1=listOfNames.get(0);
			Integer new1= listOfNames.get(0);
			int orgLength=listOfNames.size();
			while(listOfNames.contains(new1)) {
				//listOfNames.remove(Integer.valueOf(new1));
				listOfNames.remove(new1);
			}
			int newLength=listOfNames.size();
			System.out.println(new1+ "---> " +(orgLength-newLength));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListex9 a7	= new ArrayListex9();
		//If you want to use Array.asList[] for integer value you need to create 
		//array of its wrapper class that is Integer[] array
		
		Integer[] arr ={1,43,11,1,56,8,1,99,0,10};
		ArrayList<Integer> input= new ArrayList<Integer>(Arrays.asList(arr));
		a7.processData(input);
	}

}
