//Convert the Uppercase characters into lowercase and Lowercase to Uppercase from given string
package Interview;

public class Assignment34 {
	
	void convertCase(String input) {
		String output = "";
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				output= output+Character.toLowerCase(ch);
			}
			else if (Character.isLowerCase(ch)) {
				output=output+Character.toUpperCase(ch);
			}
			else {
				output =output+ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34 as	= new Assignment34();
		as.convertCase("1Yo7GEsH9");
	};
}
