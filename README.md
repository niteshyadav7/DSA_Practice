# DSA_Practice

<!-- PATTERN SOLVE KRNE KA NEW TRICKS -->

- DIVIDE KAR LO ALG-ALG
- AGAR SEEDHA NHI HO TO ::PHLE APNR MAAN MEE SEEDHA SOLVE KRNA FIR REVERSE LOOP LGA KE SOLVE.

```
import java.util.Scanner;

public class most_imp_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int spc = 1;
            while (spc <= n - i) {
                System.out.print(" ");
                spc++;
            }
            int j = 1;
            int p = 1;
            while (j <= i) {
                System.out.print(p);
                p++;
                j++;
            }
            p = i - 1;
            j = 1;
            while (j <= i - 1) {
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

```
