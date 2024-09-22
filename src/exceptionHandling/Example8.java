package exceptionHandling;

public class Example8 {

	void m1() {
		try {
			System.out.println("m1 start");
			m2(5);
			System.out.println(1);
		} catch (NullPointerException ne) {
			System.out.println("ne");
		} catch (ArithmeticException ae) {
			System.out.println("ae");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("ai");
		}
		finally {
			System.out.println(2);
		}
		System.out.println("m1 end");
	}

	void m2(int x) {

		try {
			System.out.println("m2 start");
			String arr[] = { "Maulik", "Kanani" };
			System.out.println(arr[arr.length]);
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("m2 eception");
		}
		System.out.println("m2 end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example8().m1();
	}

}
