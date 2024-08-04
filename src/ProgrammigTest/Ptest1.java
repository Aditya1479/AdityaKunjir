package ProgrammigTest;

public class Ptest1 {

	String m1(String input) {
		int no =0;
		String LowerCasestring="";
		String Uppercasetstring="";
		for(int i=0; i<input.length();i++) {
			char ch  = input.charAt(i);
			if(Character.isUpperCase(ch)) {
				Uppercasetstring = Uppercasetstring +ch ;
			}
			if(Character.isLowerCase(ch)) {
				LowerCasestring = LowerCasestring +ch ;
			}
			if(Character.isDigit(ch)) {
				no = no+ Character.getNumericValue(ch);
			}

		}

		return no+LowerCasestring+Uppercasetstring;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ptest1 P = new Ptest1();
		String Results = P.m1("TeCHNoc33r44editS");
		System.out.println(Results);
	}

}
