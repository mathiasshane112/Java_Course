package homework_file.School;

import java.util.ArrayList;

public class Math_Course extends Course implements Major {


    public Math_Course(String Department, int CourseNumber, int CreditHours, String CourseName) {
        super(Department, CourseNumber, CreditHours, CourseName);
    }


    public boolean qualifyForMajor(ArrayList<Course> list) {
        int count = 0;
        for (Course course : list) {
            if (course.getDepartment().equals("Math") && course.getCourseNumber() > 200) {
                count++;
            }
        } return count >= 3;
    }


    public String toString()
    {
        return "Math";
    }

    public static void main(String[] args) {

        // create 5 Math_Course objects
        Math_Course math1 = new Math_Course("Math", 201, 3, "Calculus");
        Math_Course math2 = new Math_Course("Math", 202, 3, "Algebra");
        Math_Course math3 = new Math_Course("Math", 203, 3, "Geometry");
        Math_Course math4 = new Math_Course("Math", 204, 3, "Trigonometry");
        Math_Course math5 = new Math_Course("Math", 205, 3, "Statistics");
        Math_Course math6 = new Math_Course("Math", 275, 4, "Differential Equations");

        // create an ArrayList of Course objects
        ArrayList<Course> mathCourses = new ArrayList<>();

        // add the 5 Math_Course objects to the ArrayList
        mathCourses.add(math1);
        mathCourses.add(math2);
        mathCourses.add(math3);
        mathCourses.add(math4);
        mathCourses.add(math5);
        mathCourses.add(math6);

        // test the qualifyForMajor method
        System.out.println(math1.qualifyForMajor(mathCourses));

        //print out the list of courses
        System.out.println(mathCourses);
    }


}
