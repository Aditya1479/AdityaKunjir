package SingletonDesignPattern;

public class connection {
	private static connection con;
	
	private connection() {
		System.out.println("DB connect");
	}

	
	static connection getobject() {
		if(con==null) {
		 con = new connection();
		}
				return con;
	}
	
	void selectData(String query) {
		
	}
	
	void deleteData(String query) {
		
	}
}
