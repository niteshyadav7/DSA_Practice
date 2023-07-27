import java.util.Scanner;

public class prob02 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i <= input.length - 1; i++) {
            input[i] = sc.nextInt();
        }
        printArray(input);
    }
}
