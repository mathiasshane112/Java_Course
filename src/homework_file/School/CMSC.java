package homework_file.School;

import java.util.ArrayList;

public class CMSC implements Major{

    public boolean qualifyForMajor(ArrayList<Course> list) {
        int count = 0;
        for (Course course : list) {
            if (course.getDepartment().equals("CMSC") && course.getCourseNumber() > 300) {
                count++;
            }
        }
        return count >= 3;
    }

    public String toString()
    {
        return "CMSC";
    }










}
