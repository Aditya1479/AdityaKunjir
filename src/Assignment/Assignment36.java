//Swap first and last element of an array, print it to confirm swap operation.
package Assignment;

import java.util.Arrays;

public class Assignment36 {
	
	
	void swapArrayElement(String[] arr) {
		int length=arr.length;
		   String temp = arr[0];
	        arr[0] = arr[length - 1];
	        arr[length - 1] = temp;
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment36 as36 = new Assignment36();
		String[] input={ "Sayli", "deepak", "Nivedita", "Yogesh"};
		as36.swapArrayElement(input);
		
	}

}
