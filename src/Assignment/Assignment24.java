package Assignment;

public class Assignment24 {
	
	void m1(String input) {
		int sum=0;
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				sum= sum+ Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of Digits " +sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment24 as24 = new Assignment24();
		as24.m1("Rah5ulTEC6Hnoc2redItS");
	}

}
