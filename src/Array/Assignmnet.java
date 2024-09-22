//if any digit found convert the string in array to uppercase 
package Array;

import java.util.Arrays;

public class Assignmnet {
	
	int m1(String[] input) {
		for (int i = 0; i < input.length; i++) {
			getstringvalues(input[i]);
		}
		return 0;
	}

	int getstringvalues(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) == true) {
				output = input.toUpperCase();
				break;
			} else {
				output = input;
			}
		}
		// return (output);
		System.out.println(output);
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignmnet as = new Assignmnet();
		String[] input = new String[4];
		input[0] = "Rahu2l";
		input[1] = "technocredits";
		input[2] = "J1ay6";
		input[3] = "credits1";

		as.m1(input);

	}

}
