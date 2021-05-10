package HomeWork1;

import java.util.Arrays;

public class Course {
    public String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    String[] course = {"Run", "Jump", "Swimming", "Steeplechase"};

    public static void printCourse(String[] course) {
        System.out.println(Arrays.toString(course));
    }

    String getCourseName(String courseName) {
        return "Название полосы препядствий:\n" + this.courseName;
    }
}
