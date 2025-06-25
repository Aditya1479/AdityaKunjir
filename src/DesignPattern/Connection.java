package DesignPattern;

public class Connection {
	
	private static Connection con;
	
	private Connection() {
		System.out.println("Connect do DB");
	}
	
	static Connection getObject() {
		if(con ==null) {
			con = new Connection();
		}
		return con;
	}
	
	
	void selectData() {
		
	}
	void deleteData() {
		
	}
	void updateData() {
		
	}
}
