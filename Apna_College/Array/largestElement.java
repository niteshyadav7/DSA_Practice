import java.util.Scanner;

public class largestElement {

    public static int largestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int i = 0;
        while (i <= arr.length - 1) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            i++;
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 13, 14, 16, 87, 45 };
        int result = largestElement(arr);
        System.out.println(result);
    }
}
