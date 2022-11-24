package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the school you want to create:");
        String schoolName = input.nextLine();
        System.out.println("Welcome to " + schoolName + ", " + "please enter the amount of how many teacher would you like to create");
        int teachersAmount = Integer.parseInt(input.nextLine());
        ArrayList<Teacher> teachersList = new ArrayList<Teacher>(teachersAmount);
        for (int i = 0; i <teachersAmount ; i++) {
            System.out.println("Please enter the name of the teaher");
            String teacherName = input.nextLine();
            System.out.println("Please enter also the salary");
            double teacherSalary = Double.parseDouble(input.nextLine());
            Teacher teacher = new Teacher(teacherName, teacherSalary);
            teachersList.add(teacher);
        }
        System.out.println(teachersList.toString());


        System.out.println("Enter the number of courses you would like to created");
        int coursesAmount = Integer.parseInt(input.nextLine());
        ArrayList<Course> coursesList = new ArrayList<Course>(coursesAmount);
        for (int i = 0; i <coursesAmount ; i++) {
            System.out.println("Please enter the name of the course");
            String courseName = input.nextLine();
            System.out.println("Please enter also the price");
            double coursePrice = Double.parseDouble(input.nextLine());
            Course course = new Course(courseName, coursePrice);
            coursesList.add(course);
        }
        System.out.println(coursesList);


        System.out.println("Enter the number of students you would like to created");
        int studentsAmount = Integer.parseInt(input.nextLine());
        ArrayList<Student> studentsList = new ArrayList<Student>(studentsAmount);
        for (int i = 0; i <coursesAmount ; i++) {
            System.out.println("Please enter the name of the student");
            String studentName = input.nextLine();
            System.out.println("Please enter also the student address");
            String studentAddress = input.nextLine();
            System.out.println("Please enter also the student email");
            String studentEmail = input.nextLine();
            Student student = new Student(studentName, studentAddress, studentEmail);
            studentsList.add(student);
        }
        System.out.println(coursesList);
    }
}