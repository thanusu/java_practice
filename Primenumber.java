import java.util.*;

public class Primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();

        int count = 0;
        if (num == 0 || num == 1) {
            System.out.println("prime Number");

        } else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
        }
        if (count > 1) {
            System.out.println(" Not a prime ");
        } else {
            System.out.println("Prime Number");
        }

    }
}
