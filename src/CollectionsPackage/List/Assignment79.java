
/*
Assignment-79 : 3rd Nov'2023

Write a program to print freq of each number using ArrayList.

input : {10,20,10,10,11,11,13}
output : 10 -> 3
         20 -> 1
		 11 -> 2
		 13 -> 1
*/


package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {
	
	void printFrequncy(ArrayList<Integer> arraylist) {	
		for(int i=0; i<arraylist.size();i++) {
			Integer count=0;
			int temp=arraylist.get(i);
			for(int index=0;index<arraylist.size();index++) {
				
				if(arraylist.get(index).equals(temp)) {
					count++;
				
				}
			}
			System.out.println(arraylist.get(i)+ "=>" +count);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,20,10,10,11,11,13};
		
		ArrayList<Integer> arraylist= new <Integer>ArrayList(Arrays.asList(arr));
		new Assignment79().printFrequncy(arraylist);
	}

}
