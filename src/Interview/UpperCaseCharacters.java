package Interview;

public class UpperCaseCharacters {
	
	
	String listUpparcaseChar(String input) {
		int UpperCount=0;
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output= output+ch;
				UpperCount++;
			}
		}
		System.out.println("From " +input+ " Count in string " +UpperCount);
		return output;
		
	}
	
	String printLowerCase(String inputLower) {
		int lowerCaseCount=0;
		String lowerString = "";
		for(int i=0;i<inputLower.length();i++) {
			char ch =inputLower.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowerString = lowerString+ ch;
				lowerCaseCount++;
			}
		}
		System.out.println("From " +inputLower+ " Count in string " +lowerCaseCount);
		return lowerString;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperCaseCharacters U = new UpperCaseCharacters();
		String output = U.listUpparcaseChar("TecHnoCredIts");
		System.out.println(output);
		System.out.println("-------------------");
		String LowerOutput = U.printLowerCase("TecHnoCredIts");
		System.out.println(LowerOutput);
	}

}
