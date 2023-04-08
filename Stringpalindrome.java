import java.util.*;

public class Stringpalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word ");
        String a = sc.next();
        sc.close();
        String b = "";
        int c = (a.length() - 1);

        for (int i = c; i >= 0; i--) {
            b += a.charAt(i);
            // System.out.println(b);
        }
        if (a.equals(b)) {
            System.out.println("palindrome");

        } else {
            System.out.println("not a palindrome");
        }
    }
}
