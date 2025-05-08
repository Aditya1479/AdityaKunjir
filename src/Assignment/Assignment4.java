package Assignment;

public class Assignment4 {
	int Capcount=0;
	int LowCount=0;
	int digitCount=0;
	void m1(String input) {		
		for(int i=0;i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				Capcount++;
			}
			else if(Character.isLowerCase(input.charAt(i))) {
				LowCount++;
			}
			else if(Character.isDigit(input.charAt(i))) {
				int sum = Character.getNumericValue(input.charAt(i));
				digitCount = digitCount+ sum;
			}
		}
		display();		
	}
	
	void display() {
		System.out.println("Capital letter count"+Capcount);
		System.out.println("Small letter count "+LowCount);
		System.out.println("Integer letter count in the given string "+digitCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4 as4 = new Assignment4();
		as4.m1("RAh5ul1Techno@redslS4");
	}

}
