package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class arraylength {
	void add(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			sum=sum+arr[index];
		}
		System.out.println("Sum is " +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arrlength= sc.nextInt();
		int[] input= new int[arrlength];
		for(int u=0;u<input.length;u++) {
			System.out.println("enter number");
			input[u]=sc.nextInt();
		}
		System.out.println(Arrays.toString(input));
		new array().add(input);
		sc.close();
	}

	}


