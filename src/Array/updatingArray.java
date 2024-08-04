package Array;

public class updatingArray {

	static void m1(String[] input) {
		input[0] = "maulik";
		for (int i = 0; i < input.length; i++) {
			String names = input[i];
			System.out.println(names + " array string names length are " + names.length());
			// Or System.out.println(input[i]+ " Length is " +input[i].length());
		}
	}

	void m2(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String names = arr[i];
			System.out.println(names + " First Letter " + names.charAt(0));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updatingArray u = new updatingArray();
		String[] a = { "Aditya", "Sayali", "Deepak", "Nivedita" };
		u.m2(a);
		System.out.println("--------------------------");
		u.m1(a);
	}
}
