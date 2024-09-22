package Array;

import java.util.Arrays;

public class NthMax {
	
	void findNthMax(int[] a, int Nth) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-Nth]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {131,45,2,4891,89,911};
		NthMax n = new NthMax();
		n.findNthMax(age, 2);
	}

}
