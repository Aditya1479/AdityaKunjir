package Assignment;

public class Assingment29 {

	void m1(String input) {
		while (input.length() > 0) {
			int orglength = input.length();
			char ch = input.charAt(input.length()-1);
			input = input.replace(input.valueOf(ch), "");
			int newLength = input.length();
			int count = orglength - newLength;
			if (orglength - newLength == 1) {
				System.out.println(ch + " --> " + (orglength - newLength));
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingment29 as29 = new Assingment29();
		as29.m1("technocredits");
	}

}
