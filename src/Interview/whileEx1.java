package Interview;
//Print the frequency of each character from given string
public class whileEx1 {
	
	void m1(String input) {	
		while(input.length()>0) {
			int OrgLength = input.length();
			char ch = input.charAt(0);
			input= input.replace(input.valueOf(ch), "");
			int newlength= input.length();
			System.out.println(ch+ " --> " + (OrgLength-newlength));		
		}  
	}
	
	void m3(String input) {	
		for(;input.length()>0;) {
			int OrgLength = input.length();
			char ch = input.charAt(0);
			input= input.replace(input.valueOf(ch), "");
			int newlength= input.length();
			System.out.println(ch+ " --> " + (OrgLength-newlength));		
		}  
	}
	
	void m2(String input) {
		for(int i=0; i<input.length();i++) {
			int count=0;
			char ch= input.charAt(i);
			if(ch != '*') {
			for(int index=0; index<input.length();index++) {
				if(ch == input.charAt(index)) {
					count++;
				}
			}
			input= input.replace(ch, '*');
			System.out.println(ch+ "  -> " +count);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileEx1 E1 = new whileEx1();
		E1.m3("Aakanksha");
	}

}
