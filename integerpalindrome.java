import java.util.*;

public class integerpalindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        int r = 0;
        int b = a;

        while (b != 0) {
            r = r * 10 + b % 10;
            b = b / 10;
        }

        if (r != a) {
            System.out.println("not a palindrome");
        } else {
            System.out.println(" palindrome");
        }
    }

}
