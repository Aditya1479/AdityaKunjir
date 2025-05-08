package Interview;

public class Armstrong {
	
	void m1(int num){
		int sum=0;
		int power= Integer.toString(num).length();
		int temp=num;
		
		while(num>0) {
		int rem=num%10;
		sum=(int) (sum+ Math.pow(rem,power));
		num=num/10;
		}
		System.out.println(temp);
		System.out.println(sum);
		
		if(temp==sum) {
			System.out.println(temp+ " is palindrome");
		}else {
			System.out.println(temp+ " is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153 = 1^3 +5^3 + 3^3 (sum of cube of all elements)
	
		Armstrong am = new Armstrong();
		am.m1(153);
	}

}
