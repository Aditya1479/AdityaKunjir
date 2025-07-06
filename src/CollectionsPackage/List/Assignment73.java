//Assignment-73 : 1st Nov'2023
//Insert number 100 at the index of first negative number.

package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment73 {

	void insert(ArrayList<Integer> input) {
		for(int i=0; i<input.size();i++) {
			Integer name= input.get(i);
			if(name<0) {
				input.add(i,100);
				break;
			}
		}
		System.out.println(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(13, -2,44, 67, -22, 14, 55, -44, 12, -3));
		ArrayList<Integer> numberList = new ArrayList();
		numberList.add(13);
		numberList.add(-2);
		numberList.add(44);
		numberList.add(67);
		numberList.add(-22);
		numberList.add(14);
		numberList.add(55);
		numberList.add(-44);
		numberList.add(12);
		numberList.add(-3);
		new Assignment73().insert(numberList);
	}

}
