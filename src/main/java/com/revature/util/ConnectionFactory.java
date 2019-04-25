package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

<<<<<<< HEAD
	
	
=======
>>>>>>> 9ebfb8f871bfdd941f38cb1e8c251fc4209a6c05
	// Private Constructor to enforce usage of factory method
	private ConnectionFactory() {}
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			return DriverManager.getConnection(System.getenv("JDBC_URL"), 
<<<<<<< HEAD
					System.getenv("JDBC_USER"), System.getenv("JDBC_PASSWORD"));
=======
											   System.getenv("JDBC_USERNAME"), 
											   System.getenv("JDBC_PASSWORD"));
>>>>>>> 9ebfb8f871bfdd941f38cb1e8c251fc4209a6c05
		} catch (SQLException e) {
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("SQL State: " + e.getSQLState());
			System.err.println("Message: " + e.getMessage());
			throw new RuntimeException("Failed to get database connection");
<<<<<<< HEAD
		}
		catch (ClassNotFoundException e) {
	        throw new RuntimeException("Failed to load JDBC Driver");
	    }
	}
	
	private static Properties getJdbcProperties() {
		Properties props = new Properties();
		try {
			props.load(Thread.currentThread()
					.getContextClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			throw new RuntimeException("Failed to load application.properties");
		} 
		
		return props;
=======
		} catch (ClassNotFoundException e) {
			System.err.println("Failed to locate JDBC Driver");
			throw new RuntimeException("Failed to locate JDBC driver");
		}
>>>>>>> 9ebfb8f871bfdd941f38cb1e8c251fc4209a6c05
	}
}
