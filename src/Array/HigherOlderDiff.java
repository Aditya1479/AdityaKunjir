package Array;

public class HigherOlderDiff {

	int m1(int[] a) {
		int large = a[0];
		int small = a[0];
		for (int i = 1; i < a.length; i++) {
			int num = a[i];
			if (large < num) {
				large = num;
			}
			else {
				if(small>num)
				small=num;
			}
		}
		System.out.println("Large Number from Array is " +large);
		System.out.println("Small number is " +small);
		//System.out.println("Difference is  " +(large-small));
	return (large-small);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = { 12, 95, 2, 48, 89, 99 };
		HigherOlderDiff hd = new HigherOlderDiff();
		int difference =hd.m1(age);
		System.out.println("Difference between two numbers are " +difference);
	}

}
