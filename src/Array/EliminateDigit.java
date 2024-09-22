package Array;

public class EliminateDigit {

	void m1(String[] input) {

		for (int i = 0; i < input.length; i++) {
			String output = "";
			for (int index = 0; index < input[i].length(); index++) {
				char ch = input[i].charAt(index);
				if (!Character.isDigit(ch)) {
					output += ch;
				}
			}
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = new String[4];
		input[0] = "Ra98hu2l";
		input[1] = "technocredits";
		input[2] = "J6ay6";
		input[3] = "c999redits1";
		EliminateDigit m = new EliminateDigit();
		m.m1(input);
	}

}
