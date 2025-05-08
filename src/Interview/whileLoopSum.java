package Interview;

public class whileLoopSum {

	void m1() {
		int sum = 0;
		int num = 1;
		while (sum < 50) {
			sum = sum + num;
			num++;
		}
		System.out.println("Current number is " + num + " Sum is " + sum);

	}

	void m2() {
		int sum = 100;
		int no = 100;
		while (sum <= 350) {
			if (no % 7 == 0) {
				sum = sum + no;
			}
			no++;
		}
		System.out.println("current number is " + no + "  is numbers which are divisble by 7" + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileLoopSum sum = new whileLoopSum();
		sum.m1();
		sum.m2();
	}

}
