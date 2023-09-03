import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        Scanner sc = new Scanner(System.in);
        // int key = 15;
        int key = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                // break;
                return;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
