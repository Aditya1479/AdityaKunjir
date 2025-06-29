package MultiThreading;

public class Employee2 extends Thread {
	
	//Run Method is from extended thread class
	@Override
	public void run() {
		m2();
	}

	void m2() {
		for(int i=101;i<=200;i++) {
			System.out.println(Thread.currentThread().getName()+ "-> " +i);
		}
	}
}
