
# 🎓 Student Management System – Java + MySQL

A simple console-based application for managing student records using Java and MySQL. Built with Object-Oriented Programming and JDBC principles.

## 🔧 Features
- Add new student
- View all students
- Delete student by ID
- Console-driven menu interface

## 🛠 Technologies Used
- Java (JDK 17)
- JDBC
- MySQL
- Eclipse IDE

## 📁 Project Structure

```
src/com/sms/
├── DBConnection.java     # Manages DB connection using JDBC
├── Student.java          # Model class for Student entity
├── StudentDAO.java       # Data access layer (DAO pattern)
└── Main.java             # Menu-driven logic
```

## 🗄 Database Schema

**Create the database and table using the script below:**

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    age INT
);
```

## 🚀 How to Run

1. Clone this repository
2. Open in Eclipse (File > Import > Existing Projects)
3. Add the MySQL JDBC Driver (`mysql-connector-java-x.x.xx.jar`) to your build path
4. Update your `DBConnection.java` credentials:
   ```java
   DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "your_password");
   ```
5. Run `Main.java`

## 🧠 Concepts Covered

- Object-Oriented Programming (OOP)
- JDBC and SQL queries
- DAO Pattern
- Exception Handling
- Console-based User Interface

## 📌 Future Enhancements
- Add GUI using Swing or JavaFX
- Implement search and sort
- Add login/authentication

---

## 📃 License

This project is open-source and available under the MIT License.
