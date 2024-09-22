package Contructor;

public class Demo {
	
		int rno;
		String name;
	
		public Demo() {
			System.out.println("Hi");
		}
		
		public Demo(int rno, String name) {
			System.out.println("2 Param Constructor");
			this.rno=rno;
			this.name=name;
		}
		void setdata(int rno, String name) {
			this.rno=rno;
			this.name=name;
		}
		
		void display() {
			System.out.println(rno+ " -- > " +name);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before constructor calling");
		Demo d = new Demo(1,"Aditya");
		System.out.println("After constructor calling");
		d.display();
	}

}
