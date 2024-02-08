package homework_file.School;

public class Student

{

    private static int nextID = 1;
    private String StudentName;
    private int StudentID;

    public Student(String StudentName, int StudentID)
    {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        nextID++;

    }


    public String toString()
    {
        return "Student Name: " + StudentName + " Student ID: " + StudentID;
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


    public static void main(String[] args) {
        Student bob1 = new Student("Bob Smith", 971);
        Student bob2 = new Student("Bob Jones", 4321);

        bob1.precedesById(bob2);
        bob2.precedesById(bob1);
    }



}
