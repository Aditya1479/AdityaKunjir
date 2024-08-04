package Interview;

public class practiceCharacter {

////Printing the frequency of given character in method
	void printCharFreq(String input, char ch) {	
		int count=0;
	 for(int i=0;i<input.length();i++) {
		 if(input.charAt(i)==ch) {
			 count++;
		 }
		 
	 }
	 System.out.println(ch+ " frequency is " +count);
	}

////Printing the frequency of each character in String
	void frequencyOfAllCharacters(String input) {
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			int FreChar = 0;
			for(int index =0; index<input.length();index++ ) {
				if(ch == input.charAt(index)) {
					FreChar++;
				}	
			}
			System.out.println(ch+ " Frequecny is " +FreChar);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceCharacter P1 = new practiceCharacter();
		P1.printCharFreq("Aakanksha", 'a');
		System.out.println("-----------------");
		P1.frequencyOfAllCharacters("Aakanksha");
	}

}
