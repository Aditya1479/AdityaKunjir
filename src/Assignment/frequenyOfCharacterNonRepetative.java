package Assignment;

public class frequenyOfCharacterNonRepetative {

	void m1(String input) {
		for(int i=0; i<input.length();i++) {
			char ch =input.charAt(i);
			int freq=0;

			if(ch != '*') {
				for(int index=0; index<input.length();index++) {
					if(ch == input.charAt(index)) {
						freq++;
					}
				
				}
				System.out.println(ch+ " Frequency is " +freq);
				input=input.replace(ch, '*');
			}
			
		}
	}
	//Method return with inhance for loop to print repeative character count using String.replace() with blank characters
	void m2(String input) {
		for(; input.length()!=0;) {
			char ch =input.charAt(0);
			int count=0;
			for(int i=0; i<input.length();i++) {
				if(ch==input.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+ " Frequency is " +count);
			input =input.replace(input.valueOf(ch), "");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequenyOfCharacterNonRepetative f1 = new frequenyOfCharacterNonRepetative();
		f1.m1("Aaknsksha");
		System.out.println("-----------------------");
		f1.m2("Aaknsksha");
	}

}
