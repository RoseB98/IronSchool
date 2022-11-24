package org.example;

public class Course {

    private String courseId;
    private String name;
    private double price;
    private double money_earned;
    private Teacher teacher;
    private static int idCounter = 0;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
        Course.idCounter = Course.idCounter + 1;
        this.courseId = String.valueOf(Course.idCounter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", money_earned=" + money_earned +
                ", teacher=" + teacher +
                '}';
    }
}
