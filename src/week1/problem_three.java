package week1;
import java.util.Scanner;

public class problem_three {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        System.out.print("Enter a number: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num2 >= num3 && num1 != num3) {
            System.out.println("Decreasing");

        } else if (num1 <= num2 && num2 <= num3 && num1 != num3) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither");
        }

        input.close();
    }
}
