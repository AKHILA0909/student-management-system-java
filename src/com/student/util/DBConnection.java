package com.student.util;

import java.sql.*;

public class DBConnection {
	
	public static Connection getConnection() throws SQLException {
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "Root@123");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
