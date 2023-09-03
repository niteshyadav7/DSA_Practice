import java.util.Arrays;
import java.util.Scanner;

public class problem03 {

    public static void reverse(int arr[]) {
        int start = 0;
        int last = arr.length - 1;
        while (start < last - 1) {
            int tem = arr[start];
            arr[start] = arr[last];
            arr[last] = tem;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 3 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
