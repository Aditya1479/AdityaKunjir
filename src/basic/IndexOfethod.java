package basic;

public class IndexOfethod {
	
	void m1(String input) {
		
		for(int i=0; i<input.length();i++) {
		char ch = input.charAt(i);
		if( input.indexOf(ch) == input.lastIndexOf(ch)) {
			System.out.println(ch);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Sayali";
		IndexOfethod a1 = new IndexOfethod();
		a1.m1(input);
		
	}

}
