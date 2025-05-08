//print the sum of all digits if the string is consist of any vowels
package Assignment;

public class Assignment35 {
	
	void printSumOFVowels(String input) {
		int no=0;
		boolean flag = false;
		if(input.contains("a") || input.contains("e") || input.contains("i") || input.contains("u")) {
			flag = true;
		}
		if(flag == true) {
			for(int i=0; i<input.length();i++) {
				char ch = input.charAt(i);
				if(Character.isDigit(ch)) {
					no = no + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(input+ " Sum of all digits present in the string == "+no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment35 as = new Assignment35();
		as.printSumOFVowels("1sYoges321h1");
		
	}

}
