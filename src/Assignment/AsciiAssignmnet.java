//Write a method to print number of Uppercase,lowercase and digits in the input using ascii.
package Assignment;

public class AsciiAssignmnet {
	
	void m1(String Input) {
		int UpperCount=0;
		int LowerCasecount=0;
		int DigitCount=0;
		int SpecialcharCount=0;
		String Upperoutput = "";
		String Loweroutput = "";
		String Digitoutput = "";
		String SpecialCharoutput = "";
		for(int i=0; i<Input.length();i++) {
			char ch = Input.charAt(i);
			if(ch>=65 && ch<=90) {
				UpperCount++;
				Upperoutput=Upperoutput+ch;
			}
			else if(ch>=97 && ch<=122) {
				LowerCasecount++;
				Loweroutput=Loweroutput+ch;
			}
			else if(ch>=48 && ch<=57) {
				DigitCount++;
				Digitoutput=Digitoutput+ch;
			}
			else {
				SpecialcharCount++;
				SpecialCharoutput=SpecialCharoutput+ch;
			}
			
		}
		System.out.println(Input+ "  -- > "+Upperoutput+ " -> "+UpperCount);
		System.out.println(Input+ "  -- > "+Loweroutput+ " -> "+LowerCasecount);
		System.out.println(Input+ "  -- > "+Digitoutput+ " -> "+DigitCount);
		System.out.println(Input+ "  -- > "+SpecialCharoutput+ " -> "+SpecialcharCount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AsciiAssignmnet As = new AsciiAssignmnet();
		As.m1("T1ecddH#");
		
	}

}
