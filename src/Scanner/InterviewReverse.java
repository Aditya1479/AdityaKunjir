package Scanner;

import java.util.Scanner;

public class InterviewReverse {

	String reverseWord(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);

		}
		return output;
	}

	void reverseString(String str) {
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(reverseWord(arr[i]) + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterviewReverse it = new InterviewReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		//String str = "India is My Country";

		 String str = sc.nextLine();
		it.reverseString(str);
	}

}
