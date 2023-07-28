import java.util.Scanner;

public class binarySeach {

    public static int binarySeach(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == 5) {
                return mid;
            } else if (arr[mid] > 5) {
                end = mid - 1;
            } else if (arr[mid] < 5) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        int result=binarySeach(input);
        System.out.println(result);
    }
}
