//Convert the input element into upper case if it contains digit.
package Assignment;

import java.util.Arrays;

public class Assignment44 {
	
	void convertStringToUppercase(String[] input) {
		for(int i=0;i<input.length;i++) {
			
			if(isDigitpresent(input[i])){
				input[i] = input[i].toUpperCase();
			}
		}
		System.out.println(Arrays.toString(input)); 
	}
	
	Boolean isDigitpresent(String input) {		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.println(input.toUpperCase());
				return true; 
			}
		}		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment44 as44= new Assignment44();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		as44.convertStringToUppercase(input);
	}

}
