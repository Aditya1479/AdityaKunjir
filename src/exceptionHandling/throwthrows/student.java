//Constructor Exception



package exceptionHandling.throwthrows;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class student {
	
	student() throws SQLException{
		
	}
	void inserData() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			student s = new student();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
