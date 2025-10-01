//Print the name having maximum and minimum length from given array.
package Assignment;

public class Assignment45 {
	
	void findminmaxlength(String[] input) {
		String maxString = input[0];
		String minString = input[0];
		
		int maxLength = input[0].length();
		int minLength = input[0].length();
		
		for(int i=0;i<input.length;i++) {			
			String name = input[i];
			int strLength = name.length();
			
			if (strLength > maxLength) {
				maxLength = strLength;
				maxString = name;
			}
			
			if (strLength < minLength) {
				minLength = strLength;
				minString = name;
			}
		}
		System.out.println(" Max length name is : " +maxString+ " ----> " +maxLength);
		System.out.println(" Min length name is : " +minString+ " ----> " +minLength);
	}
	 	
	public static void main(String[] args) {
		Assignment45 as45 = new Assignment45();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		as45.findminmaxlength(input);
	}
}
