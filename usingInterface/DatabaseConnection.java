package usingInterface;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","SubhaB@1023");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
			
		
		
	}
}
