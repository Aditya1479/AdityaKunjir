package Assignment;

public class Assignment29 {

	void m1(String input) {
		while (input.length() > 0) {
			int orgLength = input.length();
			char ch = input.charAt(input.length() - 1); // take last character
			input = input.replace(String.valueOf(ch), ""); // remove all occurrences
			int newLength = input.length();

			if (orgLength - newLength == 1) { // appears only once
				System.out.println("Last non-repeating character: " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment29 as29 = new Assignment29();
		as29.m1("technocredits");
	}
}
