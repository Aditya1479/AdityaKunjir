package Interview;

public class stringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "hi";
		String str1="hello";
		String str2="ho";
		String str3="hiNew";
		String str4= "hi";
		
		///compareTo method prints the difference between Ascii values.
		int asciiDifference= str.compareTo(str2);
		System.out.println(asciiDifference);
		
		int asciiDifference1= str.compareTo(str4);
		System.out.println(asciiDifference1);
		
		//prints the length of string
		int asciiDifference2= str.compareTo(str3);
		System.out.println(asciiDifference2);
		
	}

}
