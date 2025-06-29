package MultiThreading;

public class Employee extends Thread{
	
	//Run Method is from extended thread class
	@Override
	public void run() {
		m1();
	}
	
	void m1() {
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+ "-> " +i);
		}
	}
	

}
