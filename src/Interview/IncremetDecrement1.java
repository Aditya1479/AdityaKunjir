package Interview;

public class IncremetDecrement1 {
	
	void m1() {
		int num=1;//2,3,2
		int count=10;//11,10,9
		int temp= ++num + count++ + num++ + --num + 5 + --count + --count;
				//2 + 10 + 2 + 2+ 5 + 10 + 9
		System.out.println(num); //2
		System.out.println(count); //9
		System.out.println(temp); //40
		System.out.println("Sum of all " +(num+count+temp));
		System.out.println("Sum of all " + num +count +temp);
		System.out.println( + num +count +temp +" Sum of all " + num +count +temp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncremetDecrement1 I1 = new IncremetDecrement1();
		I1.m1();
	}

}
