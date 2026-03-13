package com.student.dao;

import java.sql.*;
import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentDAO {
	
	public void addStudent(Student s) {
		
		try {
			
			Connection con = DBConnection.getConnection();
			
			String query = "Insert into students(name, age, course) values(?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			ps.setString(3, s.getCourse());
			
			ps.executeUpdate();
			
			System.out.println("Student added successfully!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void viewStudents() {
		
		try {
			Connection con = DBConnection.getConnection();
			
			String query = "select * from students";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("id") + " " + 
				rs.getString("name") + " " +
								rs.getInt("age") + " " +
				rs.getString("course")
						);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateStudent(int id, String name, int age, String course) {
		
		try {
			
			Connection con = DBConnection.getConnection();
			
			String query = "update students set name = ?, age = ?, course = ? where id = ? ";
			
			PreparedStatement ps = con.prepareStatement(query);
			
		
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, course);
			ps.setInt(4, id);
			
			ps.executeUpdate();
			
			System.out.println("Student updated Successfully!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id) {
		
		try {
			
		Connection con = DBConnection.getConnection();
		
		String query = "delete from students where id = ?";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
		System.out.println("Student deleted successfully!");
	
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
