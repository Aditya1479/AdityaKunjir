package Assignment;

public class Assingment26 {
	
		void m1(String input) {
			while(input.length()>1) {
				int orgLength=input.length();
				char ch = input.charAt(0);
				input =input.replace(input.valueOf(ch), "");
				int newlen= input.length();
				System.out.println(ch+ " " +(orgLength-newlen));
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingment26 as26 = new Assingment26();
		as26.m1("aakansha");
	}

}
