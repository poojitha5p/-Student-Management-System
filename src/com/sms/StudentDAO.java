package com.sms;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(Student student) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO students (id, name, department, age) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getDepartment());
            stmt.setInt(4, student.getAge());
            stmt.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            System.out.println("Add Error: " + e);
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                students.add(new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getInt("age")
                ));
            }
        } catch (Exception e) {
            System.out.println("Fetch Error: " + e);
        }
        return students;
    }

    public void deleteStudent(int id) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM students WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Student deleted successfully.");
        } catch (Exception e) {
            System.out.println("Delete Error: " + e);
        }
    }
}