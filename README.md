# Student Management System

This is a console-based Student Management System developed using Java, JDBC, and MySQL.

The application allows users to manage student records with CRUD operations such as adding, viewing, updating, and deleting students.

---

## Technologies Used

- Java
- JDBC
- MySQL
- Git
- Eclipse IDE

---

## Features

- Add new student
- View all students
- Update student details
- Delete student records
- MySQL database integration

---

## Project Structure

StudentManagementSystem  
│  
├── src/com/student/model/Student.java  
├── src/com/student/dao/StudentDAO.java  
├── src/com/student/util/DBConnection.java  
└── src/com/student/main/Main.java  

---

## Database Setup

Database Name: `student_db`

Create the table using:

```sql
CREATE TABLE students(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
age INT,
course VARCHAR(50)
);
