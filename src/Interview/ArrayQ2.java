//write a method which print the double the integer you have given in array.
package Interview;

import java.util.Arrays;

public class ArrayQ2 {

	void getArray(int[] a) {
		int[] arr = { 10, 2, 6, 1, 3 };
		doubleArrayElements(arr);
	}

	void doubleArrayElements(int[] input) {
		System.out.println(Arrays.toString(input));
		for (int i = 0; i < input.length; i++) {
			input[i] = input[i] * 2;
		}
		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQ2 ar2 = new ArrayQ2();
		ar2.getArray(null);
	}

}
