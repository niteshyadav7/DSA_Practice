import java.util.Scanner;

public class printAllPairs {
    // public static void printAllPairs(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr.length; j++) {
    // if (i != j) {
    // System.out.println(arr[i] + "," + arr[j]);
    // }
    // }
    // }
    // }

    public static void printAllPairs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        printAllPairs(input);
    }
}
