package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SplitAssignment {
	String[] listofnames() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length");
		int strlength = sc.nextInt();
		String[] str = new String[strlength];
		/*
		 * System.out.println("Enter the full name"); String name = sc.nextLine();
		 * String[] str = name.split(" ");
		 */
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter name");
			str[i] = sc.next();
			calculatesum(str[i]);
		}
		return str;

	}

	void calculatesum(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(name.charAt(index));
			}
		}
		System.out.println(name + " ---> " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitAssignment as = new SplitAssignment();

		String[] output = as.listofnames();
		// System.out.println(Arrays.toString(output));
	}

}
