
//fibonacci seris 
import java.util.*;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the count ");
        int n = sc.nextInt();
        sc.close();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        for (int i = 2; i <= n; i++) {
            int third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;

        }
    }
}