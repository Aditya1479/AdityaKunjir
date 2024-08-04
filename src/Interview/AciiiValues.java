package Interview;

public class AciiiValues {
	
	void printchartToAscii(char ch) {
		int temp = ch;
		System.out.println(ch+ " ----> " +temp);
	}
	void printAsciTochar(int no) {
		char temp = (char)no;
		System.out.println(no+ " ----> " +temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AciiiValues as = new AciiiValues();
	
		as.printchartToAscii('A');
		as.printAsciTochar(65);
	}

}
