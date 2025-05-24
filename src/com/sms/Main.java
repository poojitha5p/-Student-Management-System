package com.sms;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                dao.addStudent(new Student(id, name, dept, age));
            } else if (choice == 2) {
                List<Student> students = dao.getAllStudents();
                for (Student s : students) {
                    System.out.println(s.getId() + " | " + s.getName() + " | " +
                                       s.getDepartment() + " | " + s.getAge());
                }
            } else if (choice == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                dao.deleteStudent(id);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}