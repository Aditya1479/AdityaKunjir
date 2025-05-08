//Print the positive difference in Odd and even numbers from given array.
package Array;

public class Ass1 {

	int getDiffEvenOddNum(int[] a3) {
		int diff = 0;
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < a3.length; i++) {
			if (a3[i] % 2 == 0) {
				evenSum = evenSum + a3[i];
			} else {
				oddSum = oddSum + a3[i];
			}
		}
		if (evenSum >= oddSum) {
			diff = evenSum - oddSum;
		} else {
			diff = oddSum - evenSum;
		}
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 2, 3, 3, 11, };
		Ass1 as = new Ass1();
		int diff = as.getDiffEvenOddNum(a);
		System.out.println(" Diff betn Odd and even No " + diff);

	}
}
