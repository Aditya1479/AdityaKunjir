package Assignment;

public class Assignment31 {

	void printNumberOfUppcaseAscii(String input) {
		String output="";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch>=65 && ch<=90) {
				output=output+input.charAt(i);
			}
		}
		System.out.println("Capital characters from String "+input+" are "+output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment31 as31 = new Assignment31();
		as31.printNumberOfUppcaseAscii("TeCHNocreditS");
	}

}
