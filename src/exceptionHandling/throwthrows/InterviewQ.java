//In this example one method will return only one value so from first try block 1 is answer but
//finally is always executed so it drops 1 value and now override finally block value.

package exceptionHandling.throwthrows;

public class InterviewQ {
	int m1(int x) {
		try {
			int ans = 10 / x;
			return ans;
		} catch (ArithmeticException ae) {
			return 100;
		} catch (RuntimeException re) {
			return 300;
		} catch (Exception e) {
			return 200;
		} /*
			 * catch (RuntimeException re) { return 300; }
			 */
		/* return 500; */
		finally {
			// return 10000;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewQ i = new InterviewQ();
		int x = i.m1(10);
		System.out.println(x);
	}

}
