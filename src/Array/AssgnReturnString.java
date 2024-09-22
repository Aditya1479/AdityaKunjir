package Array;

import java.util.Arrays;

public class AssgnReturnString {

	String m1(String[] input) {
		String output= "";
		for (int i = 0; i < input.length; i++) {
			output=" " +output+" "+m2(input[i])+ " ";
		}
		return output;
	}

	String m2(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				output = input.toUpperCase();
				break;
			} else {
				output = input;
			}

		}

		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssgnReturnString as = new AssgnReturnString();
		String[] input = new String[4];
		input[0] = "1Rahul";
		input[1] = "technocredits";
		input[2] = "J1ay6";
		input[3] = "credits1";
			String str =as.m1((input));
			System.out.println(str);

	}

}
