import java.util.Scanner;

public class spanOfArray {

    public static int smallest(int[] arr) {
    int smallest = arr[0];
    for (int i = 0; i < arr.length; i++) {
    if (smallest > arr[i]) {
    smallest = arr[i];
    }
    }
    return smallest;
    }

    public static int largest(int[] arr) {
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
    if (largest < arr[i]) {
    largest = arr[i];
    }
    }
    return largest;
    }

    public static void findSpan(int[] arr) {
    int spanOfArray = largest(arr) - smallest(arr);
    // return spanOfArray;
    System.out.println(spanOfArray);
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        // int results = findSpan(input);
        findSpan(input);
        // System.out.println(results);
    }
}
