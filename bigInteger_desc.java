
//desc Sorting using the BigDecimal class
import java.math.*;
import java.util.*;

class bigInteger_desc {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            BigDecimal a = new BigDecimal(s[i]);
            int index = i;

            for (int j = i + 1; j < n; j++) {
                BigDecimal b = new BigDecimal(s[j]);

                if (b.compareTo(a) == 1) {

                    a = b;
                    index = j;

                }

            }

            String temp = s[i];
            s[i] = s[index];
            s[index] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}