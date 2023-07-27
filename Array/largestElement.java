import java.util.Scanner;

public class largestElement {

    public static int largestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
        // System.out.println(largest);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i <= input.length - 1; i++) {
            input[i] = sc.nextInt();
        }
        // printArray(input);
       int ans= largestElement(input);
       System.out.println(ans);
    }
}
