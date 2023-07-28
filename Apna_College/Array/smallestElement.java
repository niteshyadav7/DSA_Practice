import java.util.Scanner;

public class smallestElement {
    public static int smallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 13, 14, 16, 87, 45 };
        int results = smallestElement(arr);
        System.out.println(results);
    }
}
