//Print Maxlength of string from an array 
package Array;

public class ArrMaxLeng {
	static int maxlength = 0;
	static String output = "";

	String[] m1(String[] input) {
		for (int i = 0; i < input.length; i++) {
			m2(input[i]);
		}
		return null;
	}

	void m2(String input) {
		int strlength = input.length();
		if (strlength > maxlength) {
			maxlength = strlength;
			output = input;
		}
	}

	// return input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrMaxLeng a = new ArrMaxLeng();

		String[] input = new String[4];
		input[0] = "Rahu2l";
		input[1] = "technocredits";
		input[2] = "J1ay6";
		input[3] = "credits1";
		a.m1(input);
		System.out.println(output + " " + maxlength);

	}
}
