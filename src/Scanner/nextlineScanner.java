package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class nextlineScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name");
		String name= sc.nextLine();
		String[] arr = name.split("-k");
		System.out.println(arr.length);
		System.out.println(arr[1]);
		System.out.println("------------------");
		System.out.println("Output: " +name);
		System.out.println(" using split method convered into array: "+Arrays.toString(arr));
		sc.close();

	}

}
