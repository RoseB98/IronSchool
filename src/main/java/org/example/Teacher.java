package org.example;

public class Teacher {

    private String teacherId;
    private String name;
    private double salary;

    private static int idCounter = 0;

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
        Teacher.idCounter = Teacher.idCounter + 1;
        this.teacherId = String.valueOf(Teacher.idCounter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void createTeachers(int teachersAmount){

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
