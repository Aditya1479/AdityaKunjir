package Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

	void add(int num1, int num2) {
		System.out.println(" Addition is " + (num1 + num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no1 = 0;
		int no2 = 0;
		while(true) {
			try {
				System.out.println("enter the 1st number");
				no1 = sc.nextInt();
				
				System.out.println("enter the 2nd number");
				no2 = sc.nextInt();
				
				break;
			} catch (InputMismatchException I) {
				sc.nextLine();
				System.out.println("Please provide the both correct numbers");
			}
		}
		/*
		 * try { System.out.println("enter the 2nd number"); no2 = sc.nextInt(); } catch
		 * (InputMismatchException I) { sc.next();
		 * System.out.println("can you please retry to enter the 1st number"); no2 =
		 * sc.nextInt(); }
		 */calculator c = new calculator();
		c.add(no1, no2);
		sc.close();
	}

}
