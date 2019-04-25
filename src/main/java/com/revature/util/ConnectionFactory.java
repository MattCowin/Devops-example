package com.revature.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	
	
	// Private Constructor to enforce usage of factory method
	private ConnectionFactory() {}
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			return DriverManager.getConnection(System.getenv("JDBC_URL"), 
					System.getenv("JDBC_USER"), System.getenv("JDBC_PASSWORD"));
		} catch (SQLException e) {
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("SQL State: " + e.getSQLState());
			throw new RuntimeException("Failed to get database connection");
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
	}
}
