import java.math.*;
import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number");

        String n = sc.next();
        BigInteger bi = new BigInteger(n);

        System.out.println(bi.isProbablePrime(10) ? "prime" : "not prime");

    }
}