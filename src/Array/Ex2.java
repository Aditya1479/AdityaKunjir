package Array;

public class Ex2 {

	void m2(int[] arr) {
		System.out.println("Length of array is " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	void sumOfElements(int[] a1) {
		int sum = 0;
		for (int i = 0; i < a1.length; i++) {
			sum = sum + a1[i];
		}
		System.out.println(" Sum OF elements All elmets in array " + sum);
	}

	void maximumNumber(int[] a) {
		int maxNo = 0;
		for (int i = 0; i < a.length; i++) {
			int no = a[i];
			for (int index = 0; index < a.length; index++) {
				if (no >= maxNo) {
					maxNo = no;
					break;
				}
			}
		}
		System.out.println("Maximum Number in the array " + maxNo);

	}

	int getsumofEvenNumbers(int[] a2) {
		int sum = 0;
		for (int i = 0; i < a2.length; i++) {
			if (a2[i] % 2 == 0) {
				sum = sum + a2[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12, 231, 22, 2, 267 };
		Ex2 ex = new Ex2();
		ex.m2(a);
		System.out.println("-------------------");
		ex.maximumNumber(a);
		System.out.println("-------------------");
		ex.sumOfElements(a);
		int Output = ex.getsumofEvenNumbers(a);
		System.out.println("Sum of Even Numbers are " + Output);

	}

}
