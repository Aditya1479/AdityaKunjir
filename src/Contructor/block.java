package Contructor;

public class block {
	{
		System.out.println(1);
		System.out.println(2);
	}
	
	block(){
		System.out.println("hi");
	}
	block(int x){
		this();
		System.out.println("hello");
		System.out.println("techno");
	}
	block(String name, boolean status){
		System.out.println("good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 new block(10);
	}

}
