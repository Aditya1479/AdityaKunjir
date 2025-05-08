package Scanner;

import java.util.Scanner;

public class student {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll num");
			int rno = sc.nextInt();
			System.out.println("Enter name ");
			String name = sc.next();
			System.out.println("enter score");
			double score= sc.nextDouble();
			System.out.println("----------------");
			System.out.println("Student number is " +rno);
			System.out.println("Student name is " +name);
			System.out.println("score is "  +score);
		}
}
