public class arraySum {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 12, 13, 14, 15 };
        int results = arraySum(arr);
        System.out.println(results);
    }
}
