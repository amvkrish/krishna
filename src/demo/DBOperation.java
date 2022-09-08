package demo;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOperation {
	Connection connection;
	Statement statement;
	ResultSet resulttset;
	
	public DBOperation () {
		connection = MySqlConnection.getInstance();
	}
	
	public int insertDatawithstatement(Employee1 emp) {
		int result =0;
		String query = "insert into Employee1 values(" +emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+", '"+emp.getAddress()+" ')";
		
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	try {
		result = statement.executeUpdate(query);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return result;
	
	}
	public static void main(String[] args) {
		
		DBOperation db = new DBOperation();
		
		Scanner sc = new Scanner(System.in);
		
		Employee1 em = new Employee1();
		
		System.out.println("Please enter Employee ID");
		em.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Please enter Employee Name");
		em.setName(sc.nextLine());
		
		System.out.println("Please enter Employee Salary");
		em.setSalary(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Please enter Employee Address");
		em.setAddress(sc.nextLine());
		
		db.insertDatawithstatement(em);
		
				
}
	
	
}


