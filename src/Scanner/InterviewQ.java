package Scanner;

import java.util.Scanner;

public class InterviewQ {

	String reversetheString(String input) {
		String output = "";
		for (int i = input.length()- 1; i >= 0; i--) {
			output = output + input.charAt(i) + "";
			output.trim();
		}
		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewQ iq = new InterviewQ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string You want reverse");
		String input = sc.nextLine();
		String output=iq.reversetheString(input);
		System.out.println(output);
		sc.close();
	}

}
