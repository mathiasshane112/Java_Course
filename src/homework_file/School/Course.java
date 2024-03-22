package homework_file.School;

public class Course


{
    private final String Department;
    private final int CourseNumber;

    public Course(String Department, int CourseNumber, int CreditHours, String CourseName)
    {
        this.Department = Department;
        this.CourseNumber = CourseNumber;
    }

    public String toString()
    {
        //return CourseName;
        return "Department: " + Department + " Course Number: " + CourseNumber; // + " Credit Hours: " + CreditHours;
    }

    // HW 3 - Question 3

    public boolean equals(Course other){
        if (other instanceof Course) {
            Course otherCourse = (Course) other;
            return this.Department.equals(otherCourse.Department) &&
                    this.CourseNumber == otherCourse.CourseNumber;
                 //   this.CreditHours == otherCourse.CreditHours &&
                 //   this.CourseName.equals(otherCourse.CourseName);

        } else return false;
    }


    protected int getCourseNumber() {
        return CourseNumber;
    }

    protected Course getDepartment() {
        return this;
    }

    // Homework 5 Question 2 - Built in sort


//    public int compareTo(Course other) {
//        if (this.Department.equals(other.Department)) {
//            return this.CourseNumber - other.CourseNumber;
//        } else {
//            return this.Department.compareTo(other.Department);
//        }
//    }
//
//    // testing the compareTo method above
//
//    public static void main(String[] args) {
//        Course c1 = new Course("CS",101, 3, "Intro to CS");
//        Course c2 = new Course("CS", 102, 3, "Data Structures");
//        Course c3 = new Course("Math", 101, 3, "Calculus");
//        Course c4 = new Course("Math", 102, 3, "Algebra");
//
//        System.out.println(c1.compareTo(c2)); // should return a negative number
//        System.out.println(c2.compareTo(c1)); // should return a positive number
//        System.out.println(c1.compareTo(c1)); // should return 0
//        System.out.println(c3.compareTo(c4)); // should return a negative number
//        System.out.println(c4.compareTo(c3)); // should return a positive number
//
//    }












}





