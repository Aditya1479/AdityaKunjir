package DesignPattern;

public class Connection2Eagerstaticblock {
	
	//Static block Eager Initialization
	
	private static Connection2Eagerstaticblock con ;
	
	static {
	 con= new Connection2Eagerstaticblock();
	}
	
	private Connection2Eagerstaticblock() {
		System.out.println("Connect do DB");
	}
	
	static Connection2Eagerstaticblock getObject() {
		return con;
	}
	
	
	void selectData() {
		
	}
	void deleteData() {
		
	}
	void updateData() {
		
	}
}
