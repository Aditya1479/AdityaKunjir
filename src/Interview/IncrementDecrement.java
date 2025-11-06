package Interview;

public class IncrementDecrement {
	
	void PostIncremnet() {
		int num=10;
		int sum = num++ + 5 + num++ ;
		System.out.println(" PostIncrement " +sum);
		System.out.println(" PostIncrement " +num);
	}
	
	void PreIncremnet() {
		int num=10;
		int sum = ++num + 5 + ++num ;
		System.out.println(" PreIncrement " +sum);
		System.out.println(" PretIncrement " +num);
	}
	
	void m1() {
		int num =10; //11
		int sum= ++num + num++ + --num + --num + num++ + 5;//11+11+11+10+10+5
		System.out.println("  " +sum);
		System.out.println("  " +num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncrementDecrement I1 = new IncrementDecrement();
		I1.m1();
		I1.PostIncremnet();
		I1.PreIncremnet();
	}

}
