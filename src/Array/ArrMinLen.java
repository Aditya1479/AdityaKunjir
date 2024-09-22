package Array;

public class ArrMinLen {
	void m1(String[] input) {
	String maxLengthName = "";
	String minLengthName = "";
	int maxL = input[0].length();
	int minL = input[0].length();
	for(int i=1; i<input.length; i++) {
		int length = input[i].length();
		if(maxL<length) {
			maxL = input[i].length();
			maxLengthName = input[i];
		}else if(minL>length) {
			minL = input[i].length();
			minLengthName = input[i];
		}
	}
	System.out.println(minL+ " Min length name is: "+minLengthName);
	System.out.println(maxL+ " Max length name is: "+maxLengthName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrMinLen a = new ArrMinLen();

		String[] input = new String[4];
		input[0] = "Rahu2l";
		input[1] = "technocredits";
		input[2] = "J1ay";
		input[3] = "credits1";
		a.m1(input);
	}

}
