package homework_file;
import java.util.Scanner;

public class first_homework {
    // Question 2
//    public static void main(String[] args) {
//        int x = 1;
//        int y = 4;
//        int z = 3;
//
//        double average = (x + y + z / 3);
//
//        System.out.print("Average is " + average);
//    }
//}

    // Question 3 - variable types

//    public static void main(String[] args) {
//        int x;
//        int t = 0;
//        System.out.println(t == (x = 5));
//        System.out.println(t);
//    }

    // Question 4 & 5

//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the diameter of a pizza: ");
//        double diameter = input.nextInt();
//
//        double radius = diameter / 2;
//        double area = Math.PI * Math.pow(radius, 2);
//
//        System.out.print("Enter the number of slices: ");
//        double slice = area / input.nextInt();
//
//        System.out.println("The area of a slice of pizza is " + String.format("%.3f",slice)) ;
//
//
//    }

    // Question 6 - Conditionals

//    public static void main(String[] args) {
//
//      String letterGrade = "F";
//      double grade = 90.8;
//      if (grade >= 90) {letterGrade = "A";}
//      else if (grade >= 80) {letterGrade = "B";}
//      else if (grade >= 70) {letterGrade = "C";}
//      else if (grade >= 60) {letterGrade = "D";}
//        System.out.println(letterGrade);
//
//    }


    // Question 7 - Conditionals

//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the temperature: ");
//        double temp = input.nextDouble();
//
//
//        if (temp < 30) {
//            System.out.println("Cold!");
//            System.out.println(30 - temp + " is the temperature difference from 30.");
//        } else if (temp > 30) {
//            System.out.println("Not bad.");
//
//
//        }
//    }

    // Question 8 - Switch Statement

//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a letter grade: ");
//        String letterGrade = input.nextLine();
//
//        switch (letterGrade) {
//            case "A":
//                System.out.println("4");
//                break;
//            case "B":
//                System.out.println("3");
//                break;
//            case "C":
//                System.out.println("2");
//                break;
//            case "D":
//                System.out.println("1");
//                break;
//            case "F":
//                System.out.println("0");
//                break;
//            default:
//                System.out.println("Invalid grade!");
//                break;
//        }
//    }

    // Question 9 - For Loop
//    public static void main(String[] args) {
//
//        int number1 = 321;
//        int number2 = 11;
//
//        for (int i = number1; i >= number2; i--) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//
//
//
//    }

    // Question 10 - For Loop

//    public static void main(String[] args) {
//
//        System.out.println("Celsius\t\tFahrenheit");
//        System.out.println("-------\t\t----------");
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i + "\t\t" + (i * 9/5 + 32));
//        }
//    }

    // Question 11 - While Loop & User Input

//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int sum = 0;
//
//        while (true) {
//
//            System.out.println("Enter \"done\" when you are finished.");
//            System.out.print("Enter a word: ");
//
//            String word = input.nextLine();
//            if (word.equals("done")) {
//                break;
//            }
//            sum += word.length();
//        }
//        System.out.println("The sum of the lengths of all the words entered is " + sum);
//
//
//    }

    // Question 12 - Selection Operator
//
//    public static void main(String[] args) {
//
//        int a = 3;
//        int b = 2;
//
//        System.out.println(b = (a == ++b) ? b - 1 : a + 1);
//    }

}
















