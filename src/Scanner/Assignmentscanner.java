package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Assignmentscanner {
	void printgetDigitSum(String[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " -> " + calculatesum(arr[i]));
		}
	}

	int calculatesum(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(name.charAt(index));
			}
		}
		System.out.println(name + " ---> " + sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignmentscanner as = new Assignmentscanner();

	//	String[] output = as.printgetDigitSum();
		// System.out.println(Arrays.toString(output));
	}

}
