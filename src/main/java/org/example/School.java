package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Student> students = new ArrayList<Student>();
    private List<Course> courses = new ArrayList<Course>();
    private List<Teacher> teachers = new ArrayList<Teacher>();

    public void enroll (String studentId, String courseId){
     //loopear por la lista student para econtrar un student que coincida con el id que nos pasan
        //podria ser haciendo un scanner y guardar el input en una variable, pasarla aca al for
        // student1
        //hacer lo mismo con el curse
        // course1
        //student1.setCourse(course1) para el enrooll
    }

    public void assing (String teacherId, String courseId){

    }

    public void lookUpCourse (String courseId){

    }

    public void lookUpStudent (String studentId){

    }

    public void lookUpTeacher(String teacherId){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
