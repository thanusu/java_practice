
//get the array size and fill the values and Arrays.toStirng();
import java.util.*;

public class NumArray1d {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the  " + i + " value : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }

}
