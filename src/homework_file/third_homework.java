package homework_file;
import java.util.Random;

public class third_homework {

    // Question 1
//
//    public static int addAllNumbers(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                sum += arr[i];
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] test = {1, 2, 3, 4, 5};
//        System.out.println(addAllNumbers(test));
//    }

    // Question 2
    
    public static int[] randomArray(int n, int bottom, int top) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(top - bottom) + bottom;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] test = randomArray(5, 10, 20);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    // Question 3



}
