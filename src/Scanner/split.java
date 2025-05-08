package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the full name");
		String name = sc.nextLine();
		String[] str = name.split(" m");
		System.out.println("------------");
		System.out.println(name);
		System.out.println(Arrays.toString(str));

	}

}
