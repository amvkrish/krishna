package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static MySqlConnection mysqlconnection = new MySqlConnection();
	
	Connection connection;
	
	private MySqlConnection() {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrm","root","@P9154188733d");
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		
		} catch (SQLException e) {
			e.printStackTrace() ;	
		}
	}
	
	public static Connection getInstance() {
		return mysqlconnection.connection;
	}
	public static void main(String[] args) {
		
		System.out.println(mysqlconnection.getInstance());
		

	}

}
