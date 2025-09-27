//Write a method to print number of Uppercase,lowercase and digits in the input using ascii
package Assignment;

public class Assignment32 {
	void printNumberOfUpLoDAscii(String input) {
		int uppercount=0;
		int Lowercount=0;
		int digicount=0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch>=65 && ch<=90) {
				uppercount++;
				
			}else if(ch>=97 && ch<=122) {
				Lowercount++;
			}else {
				digicount++;
			}
		}
		System.out.println(input+ " Uppercasecount is " +uppercount);
		System.out.println(input+ " LowercaseCout is " +Lowercount);
		System.out.println(input+ " DigitCount " +digicount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment32().printNumberOfUpLoDAscii("TeCHNoc33r44editS");
	}

}
