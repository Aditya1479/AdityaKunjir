package SingletonDesignPattern;

public class client {

	
	public static void main(String[] args) {
		connection con = connection.getobject();
		connection con1= connection.getobject();
		
		System.out.println(con);
		System.out.println(con1);
	}
}
