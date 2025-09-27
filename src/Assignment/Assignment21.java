package Assignment;

public class Assignment21 {
	int charFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void findMaxCharFreq(String input) {
		int maxCount = 0;
		char maxChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int frequecny = charFreq(input, ch);
			if (maxCount < frequecny) {
				maxCount = frequecny;
				maxChar = ch;
			}
		}
		System.out.println(input + " -- " + maxChar + " -- " + maxCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment21 as = new Assignment21();
		as.findMaxCharFreq("teecccchnoceredites");
		as.findMaxCharFreq("aakansha");
		as.findMaxCharFreq("technocredits");
	}

}
