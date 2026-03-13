package com.student.main;

import java.util.Scanner;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class Main {

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		
		while(true) {
			System.out.println("\n======= Student Management System =======");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				
				System.out.println("Enter name: ");
				String name = sc.next();
				
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				
				System.out.println("Enter course: ");
				String course = sc.next();
				
				Student s = new Student(name, age, course);
				
				dao.addStudent(s);
				
				break;
				
				
			case 2:
				
				dao.viewStudents();
				
				break;
				
			case 3:
				System.out.println("Enter the student ID to update: ");
				int id = sc.nextInt();
				
				System.out.println("Enter new name: ");
				String newName = sc.next();
				
				System.out.println("Enter new age: ");
				int newAge = sc.nextInt();
				
				System.out.println("Enter new course: ");
				String newCourse = sc.next();
				
				dao.updateStudent(id, newName, newAge, newCourse);
				
				break;
				
			case 4:
				
				System.out.println("Enter student ID to delete: ");
				int deleteId = sc.nextInt();
				
				dao.deleteStudent(deleteId);
				break;
				
			case 5:
				
				System.out.println("Exiting program.....");
				return;
				
			default:
				System.out.println("Invalid choice ! Please enter correct choice");
				
			}
		}
		
	}
}
