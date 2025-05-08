package Interview;
//Printing first repeatative character from given String
public class WhilCharFreq {

	
	//method priniting the first repeatative character from string
	void m1(String input) {
		while(input.length()>0) {
			int orLength= input.length();
			char ch = input.charAt(0);
			input=input.replace(input.valueOf(ch), "");
			int Newlength=input.length();
			if(orLength-Newlength>1) {
				System.out.println(ch+ " first repetative character> "+(orLength-Newlength));
				break;
			}
			//System.out.println(ch+ "---> "+(orLength-Newlength));
		}
	}
	
	//Printing the first non repetitive character from string
	void m2(String input) {
		while(input.length()>0) {
			int orLength= input.length();
			char ch = input.charAt(0);
			input=input.replace(input.valueOf(ch), "");
			int Newlength=input.length();
			if(orLength-Newlength==1) {
				System.out.println(ch+ " First Non-repetative character> "+(orLength-Newlength));
				break;
			}
			//System.out.println(ch+ "---> "+(orLength-Newlength));
		}
	}
	
	void m3(String input) {
		while(input.length()>0) {
			int orLength= input.length();
			char ch = input.charAt(0);
			input=input.replace(input.valueOf(ch), "");
			int Newlength=input.length();
			System.out.println(ch+ "---> "+(orLength-Newlength));
		}
	}
	
	//Last Non Repetative Character in String
	void m4(String input) {
		while(input.length()>0) {
			int OrgLength= input.length();
			char ch =input.charAt(input.length()-1);
			input =input.replace(input.valueOf(ch), "");
			int NewLength= input.length();
			if(OrgLength-NewLength==1) {
				System.out.println(ch+ " Last Non repeataive character is "+(OrgLength-NewLength));
				break;
			} 
		}
	}
	//Last Repetative Character in String
	void m5(String input) {
		while(input.length()>0) {
			int OrgLength= input.length();
			char ch =input.charAt(input.length()-1);
			input =input.replace(input.valueOf(ch), "");
			int NewLength= input.length();
			if(OrgLength-NewLength>1) {
				System.out.println(ch+ " Last Non repeataive character is "+(OrgLength-NewLength));
				break;
			} 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhilCharFreq w1 = new WhilCharFreq();
		w1.m1("atbdchnocredits");
		w1.m2("atbdchnocredits");;
		w1.m3("atbdchnocredits");
		w1.m4("atbdchnocredits");
		w1.m5("atbdchnocredits");
		
	}

}
