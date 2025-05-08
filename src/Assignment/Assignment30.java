package Assignment;

public class Assignment30 {
	
	String printUppercase(String input) {
		String output = "";
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				output= output+ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30 as30 = new Assignment30();
		String output= as30.printUppercase("TeCHNocreditS");
		System.out.println(output);
	}

}
