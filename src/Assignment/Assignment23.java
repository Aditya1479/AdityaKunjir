package Assignment;

public class Assignment23 {

	void m1(String input) {
		int Ucount = 0;
		int lcount = 0;
		int dcount = 0;
		int scount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			{
				if (Character.isUpperCase(input.charAt(i))) {
					Ucount++;
				} else if (Character.isLowerCase(input.charAt(i))) {
					lcount++;
				} else if (Character.isDigit(input.charAt(i))) {
					dcount++;
				} else {
					scount++;
				}
			}
		}
		System.out.println("UpperCasecpunt: " + Ucount + " LowerCaseCount: " + lcount + " DigitCount: " + dcount
				+ " SpecialCharacter: " + scount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment23 as23 = new Assignment23();
		as23.m1("TecHNo_cR6ediTs");
	}

}
