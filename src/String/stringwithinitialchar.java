//Print name and its first letter from given array.
package String;

public class stringwithinitialchar {
	
	void getStringNamewithInitialChar(String[] input) {
		char ch=' ';
		for(int i=0;i<input.length;i++) {
			String aa= input[i];
			m2(aa);
		}		
	}
	
	void m2(String input) {
		char ch=' ';
		for(int i=0;i<input.length();i++) {
			char ab = input.charAt(0);
			ch=ab;
		}
		System.out.println(input+ "-> " +ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringwithinitialchar sv= new stringwithinitialchar();
		
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		sv.getStringNamewithInitialChar(input);
	}

}
