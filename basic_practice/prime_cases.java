public class prime_cases {

    public static void allPrime(int low, int high) {
        for (int i = low; i <= high; i++) {
            // System.out.println(i);
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                if (i == 1)
                    continue;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        allPrime(1, 100);
    }
}
