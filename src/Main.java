import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//task 1
        int[] numbers = new int[]{1, 2, 3};
        double[] fraction = {1.57, 7.654, 9.986};
        long[] numbers2 = {67, 82, 90, 11};
// task 2
        System.out.println("task 2");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();
        for (int y = 0; y < fraction.length; y++) {
            if (y > 0) {
                System.out.print(", ");
            }
            System.out.print(fraction[y]);
        }
        System.out.println();
        for (int n = 0; n < numbers2.length; n++) {
            if (n > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers2[n]);
        }
        System.out.println();
        //task 3
        System.out.println("task 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = fraction.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(fraction[i] + ", ");
            } else {
                System.out.print(fraction[i]);
            }
        }
        System.out.println();
        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers2[i] + ", ");
            } else {
                System.out.print(numbers2[i]);
            }
        }
        System.out.println();
        //task 4
        System.out.println("task 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr) + " ");
    }
}