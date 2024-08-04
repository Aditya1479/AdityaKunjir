package ProgrammigTest;

public class PTest {
	String m1(String input) {

		String output="";
		String NumString="";
		String Lowercase="";
		for(int i =0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				NumString = NumString+ch;
			}
			if(Character.isUpperCase(ch)) {
				output = output+ch;
			}
			if(Character.isLowerCase(ch)) {
				Lowercase = Lowercase+ch;
			}	
		}
		return NumString+Lowercase+output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PTest p = new PTest();
		String Result = p.m1("TeCHNoc33r44editS");
		System.out.println(Result);
	}

}
