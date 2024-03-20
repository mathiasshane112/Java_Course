package homework_file.School;

import java.util.ArrayList;

public class Student

{

    private static int nextID = 1;
    private final homework_file.School.Major Major;
    private String StudentName;
    private final int StudentID;

    private Major major;

    private ArrayList<Course> courses = new ArrayList<>();


    public Student(String StudentName, int StudentID)
    {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.Major = major;
        nextID++;


    }


    public String toString() {

        if (courses.size() == 4){
            return "Student Name: " + StudentName + " Student ID: " + StudentID + " Courses: " + courses + " Major: "
                    + Major + " Qualify for Major: " + Major.qualifyForMajor(courses);
        } else if (courses.size() < 3 && courses.size() >= 1) {
            return "Student Name: " + StudentName + " Student ID: " + StudentID + " Not full-time" + " Major: "
                    + Major + " Qualify for Major: " + Major.qualifyForMajor(courses);
        } else {
            return "Student Name: " + StudentName + " Student ID: " + StudentID + " Not enrolled in any course."
                    + " Major: " + Major + " Qualify for Major: " + Major.qualifyForMajor(courses);
        }

    }



    public void NameChange(String newName)
    {
        this.StudentName = newName;
    }

    public boolean precedesById(Student other)
    {
        if (this.StudentID < other.StudentID)
        {
            System.out.println("True");
            return true;
        }
        else
        {
            System.out.println("False");
            return false;
        }
    }



    // HW 3 - Question 5

    public void addingCourse(Course course){
        if (!courses.contains(course)){
            courses.add(course);
        }
    }

    // HW 3 - Question 6
    public void droppingCourse(Course course){
        if (courses.contains(course)){
            courses.remove(course);
        }
    }





}
