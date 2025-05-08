package Assignment;

public class Assingment27 {
	void m1(String input) {
		while (input.length() > 1) {
			int orglength = input.length();
			char ch = input.charAt(0);
			input = input.replace(input.valueOf(ch), "");
			int newlen = input.length();
			if (orglength -newlen>1 ) {
				System.out.println(ch + " -> " + (orglength - newlen));
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingment27 as27 = new Assingment27();
		as27.m1("abcdcededffff");
	}

}
