package Array;

public class prob02 {
    public static void swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 76 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            System.out.println(arr[i]);
        }
    }
}
