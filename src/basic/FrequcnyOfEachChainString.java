package basic;

public class FrequcnyOfEachChainString {

	void maxFrqCharacter(String input) {
		char maxChar= ' ';
		int maxCount= 0;		
		for(int i=0; i<input.length();i++) {	
			char ch = input.charAt(i);
			int count =printFrquency(input, ch);
			if(count>maxCount) {
				maxCount = count;
				maxChar = ch;
			}
		}
			System.out.println(maxChar+ " -> " +maxCount);
		}
		
	int printFrquency(String input, char ch) {	
		int count =0;
			for(int index=0; index<input.length(); index++) {	
				if(input.charAt(index)==ch) {
					count++;
			}
		}
				//System.out.println(ch+ " Frequency in " +input+ " is " +count )
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userinput ="akanksha";
		FrequcnyOfEachChainString f1 = new FrequcnyOfEachChainString();
		//f1.printFrquency(userinput,'a');
		f1.maxFrqCharacter(userinput);
	}

}

