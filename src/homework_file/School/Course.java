package homework_file.School;

public class Course


{
    private String Department;
    private int CourseNumber;
    private int CreditHours;

    private String CourseName;

    public Course(String Department, int CourseNumber, int CreditHours, String CourseName)
    {
        this.Department = Department;
        this.CourseNumber = CourseNumber;
        this.CreditHours = CreditHours;
        this.CourseName = CourseName;
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
}





