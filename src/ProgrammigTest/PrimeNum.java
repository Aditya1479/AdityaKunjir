package ProgrammigTest;

public class PrimeNum {

	static boolean findPrime(int no) {
		for (int i = 2; i <= no/2; i++) {
			if (no / i == 0) {
				return false;
		}
			
	}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNum P = new PrimeNum();
		for(int i=2;i<10;i++) {
			findPrime(i);
		}
		
	}

}
