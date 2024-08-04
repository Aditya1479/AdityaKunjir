package basic;

public class CharacterClassMethods {
	
	void m1(String input) {
		int Ucount=0;
		int lcount=0;
		int Dcount=0;
		int Scount=0;
		for(int i=0;i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				Ucount++;
			}
			else if(Character.isLowerCase(input.charAt(i))) {
				lcount++;
			}
			else if(Character.isDigit(input.charAt(i))) {
				Dcount++;
			}
			else{
				Scount++;
			}
		}
		System.out.println("Uppercase letters "+Ucount);
		System.out.println("Lowercase letters "+lcount);
		System.out.println("Digit letters "+Dcount);
		System.out.println("Sepecial Characters letters "+Scount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterClassMethods c1 = new CharacterClassMethods();
		c1.m1("AkaNksh1a");
	}

}
