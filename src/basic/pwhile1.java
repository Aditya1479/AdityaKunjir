package basic;

class pwhile1 {
	void display(String input) {

		while (input.length() > 0) {
			int Olen = input.length();
			char ch = input.charAt(0);
			input = input.replace(input.valueOf(ch), "");
			int newlen = input.length();
			System.out.println(ch + " --->" + (Olen - newlen));
		}
	}

	public static void main(String[] args) {
		pwhile1 p = new pwhile1();
		p.display("aakansha");
	}
}
