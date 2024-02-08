package homework_file.School;

public class Course
{
    private String Department;
    private int CourseNumber;
    private int CreditHours;

    public Course(String Department, int CourseNumber, int CreditHours)
    {
        this.Department = Department;
        this.CourseNumber = CourseNumber;
        this.CreditHours = CreditHours;
    }

    public String toString()
    {
        return "Department: " + Department + " Course Number: " + CourseNumber + " Credit Hours: " + CreditHours;
    }


}
