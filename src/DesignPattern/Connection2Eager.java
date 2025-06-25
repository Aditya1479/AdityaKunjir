package DesignPattern;

public class Connection2Eager {
	
	//Eager Initialization
	
	private static Connection2Eager con = new Connection2Eager();
	
	private Connection2Eager() {
		System.out.println("Connect do DB");
	}
	
	static Connection2Eager getObject() {
		return con;
	}
	
	
	void selectData() {
		
	}
	void deleteData() {
		
	}
	void updateData() {
		
	}
}
