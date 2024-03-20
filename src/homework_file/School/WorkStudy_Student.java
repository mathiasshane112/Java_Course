package homework_file.School;

public class WorkStudy_Student extends Student {

    private int hoursWorked;

    public WorkStudy_Student(String StudentName, int StudentID, int hoursWorked) {
        super(StudentName, StudentID);
        this.hoursWorked = hoursWorked;
    }

    public String toString(String StudentName, int StudentID) {
        return "Student Name: " + StudentName + " Student ID: " + StudentID
                + " Work-Study Student, " + " Total Earned: " + hoursWorked * 7.25;
    }

    public static void main(String[] args) {
        WorkStudy_Student s1 = new WorkStudy_Student("John", 1, 20);
        WorkStudy_Student s2 = new WorkStudy_Student("Jane", 2, 15);

        System.out.println(s1);
        System.out.println(s2);
    }

}



