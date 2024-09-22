package SubString;
public class Assignment40 {
	
	void processString (String input, char ch) {
		String output = input.substring(input.indexOf(ch), input.lastIndexOf(ch));
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		assignment40.processString("technocredits", 'e');
	}
}