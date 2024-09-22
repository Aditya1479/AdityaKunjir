package SubString;

public class Example1 {

	void m1(String input, char ch) {
		while(input.length()>1) {
			int Orglength= input.length();
			char ch1 = input.charAt(0);
			input= input.replace(input.valueOf(ch1),"");
			int Newlength=input.length();
			if(Orglength-Newlength>1) {
				System.out.println(ch+ " first repetative character> "+(Orglength-Newlength));
				break;
			}
		}
		String output=input.substring(input.indexOf(ch), input.lastIndexOf(ch));
		
	}
	
	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.m1("Jaukaumarapqw", 'a');
	}
}
