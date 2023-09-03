import java.util.Scanner;

public class problem01 {
    public static int sl(int arr[]) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, -12, 6 };
        int small = sl(arr);
        System.out.println(small);
    }
}
