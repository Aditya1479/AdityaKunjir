package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class nextline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string length");
		int strlen = sc.nextInt();
		sc.nextLine();	
		String[] name = new String[strlen];
		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter full name");
			name[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(name));
		sc.close();

	}

}
