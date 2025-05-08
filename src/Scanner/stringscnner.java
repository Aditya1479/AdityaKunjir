package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class stringscnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array ");
		int strlength = sc.nextInt();
		String[] name= new String[strlength];
		for(int i =0; i<name.length;i++) {
			System.out.println("Enter " +i+ " name");
			name[i]=sc.next();
		}
		System.out.println(Arrays.toString(name));
		sc.close();
	}

}
