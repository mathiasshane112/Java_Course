package week4;
import java.util.Scanner;

public class Quiz1Work {

//    public static void main(String[] args) {
//        // Question 2
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of credit hours you have: ");
//        int creditHours = input.nextInt();
//
//        if (creditHours < 30) {
//            System.out.println("You are a Freshman");
//        } else if (creditHours >= 30 && creditHours < 60) {
//            System.out.println("You are a Sophomore");
//        } else if (creditHours >= 60 && creditHours < 90) {
//            System.out.println("You are a Junior");
//        } else {
//            System.out.println("You are a Senior");
//        }
//
//
//
//    }


    // Question 3


    public static int addUp(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the beginning value: ");
        int start = input.nextInt();

        System.out.print("Enter the ending value: ");
        int end = input.nextInt();

        System.out.println("The sum of the numbers between " + start + " and " + end + " is " + addUp(start, end));
    }









}
