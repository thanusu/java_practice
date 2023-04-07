
//to find the a+b, a*b by using BigInteger 
import java.math.BigInteger;
import java.util.Scanner;

public class biginteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        BigInteger ai = new BigInteger(a);
        BigInteger bi = new BigInteger(b);

        System.out.println(ai.add(bi));
        System.out.println(ai.multiply(bi));
    }

}
