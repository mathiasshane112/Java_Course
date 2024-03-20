package homework_file.School;

public class CG_Course extends Course {

    private String location;

    public CG_Course(String Department, int CourseNumber, int CreditHours, String CourseName, String location) {
        super(Department, CourseNumber, CreditHours, CourseName);
        this.location = location;
    }

    public String toString(String CourseName) {
        return CourseName + "CG course in " + location;
    }

    public static void main(String[] args) {
        Course c1 = new Course("CS",101, 3, "Intro to CS");
        Course c2 = new Course("CS", 102, 3, "Data Structures");

        CG_Course c3 = new CG_Course("CS", 103, 3, "Java 101",
                "West Des Moines");
        CG_Course c4 = new CG_Course("CS", 104, 3, "Python 101",
                "Simpson");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
