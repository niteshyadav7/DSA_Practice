public class linearSeach {

    public static int linearSeach(int[] arr, int x) {
        int i = 0;
        while (i <= arr.length - 1) {
            if (arr[i] == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = 1;
        int[] arr = { 11, 12, 13, 14, 15, 16, 1 };
        int results = linearSeach(arr, x);
        System.out.println(results);
    }
}
