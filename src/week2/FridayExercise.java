package week2;

public class FridayExercise
{

    public static void main(String[] args) {
        double total_distance = 0;
        double daily_distance = 10.000;
        int day = 1;


        while (daily_distance >= 0.1) {
            day++;
            total_distance += daily_distance;
            daily_distance = daily_distance * 0.7;
            System.out.println("Day " + day + " distance today = " + String.format("%.3f",daily_distance) + " total = "
                    + total_distance);
        }
    }
}
