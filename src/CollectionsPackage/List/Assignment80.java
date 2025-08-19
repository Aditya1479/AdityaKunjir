
/*
Assignment-80 : 3rd Nov'2023

Write a program to print freq of each name using ArrayList.

input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1
*/


package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {
	
	void printFrequncy(ArrayList<String> arraylist) {	
		for(int i=0; i<arraylist.size();i++) {
			Integer count=0;
			String temp=arraylist.get(i);
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
		String[] arr= {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"};
		
		ArrayList<String> Stringarraylist= new <Integer>ArrayList(Arrays.asList(arr));
		new Assignment80().printFrequncy(Stringarraylist);
	}

}
