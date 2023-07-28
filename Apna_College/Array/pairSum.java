public class pairSum {
    public static void pairSum(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 7) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 2, 5, 4, 3, 2, 4 };
        pairSum(arr);
    }

}
