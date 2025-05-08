package Interview;

public class palindrome {

	static boolean ispalindrome(int num) {
		int temp=num;
		int output=0;
		
		while(num>0) {
		int rem=num%10;
		output=(output * 10) + rem;
		num=num/10;
		}
		
		return output==temp;
	}
	
	
	static boolean checkispalindromestring(int num) {
		String number= Integer.toString(num);
		String reversestring= "";
		for(int i=number.length()-1; i>=0;i--) {
			reversestring = reversestring + number.charAt(i);
		}
		
		
		return reversestring.equals(reversestring);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkispalindromestring(1232144));
	}

}
