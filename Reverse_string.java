import java.util.*;
class Reverse_string {
    public static void main(String[] args) {
        String a = "susb";
        int b = a.length();
        for (int i = b-1; i >= 0; i-- ){
            System.out.print(a.charAt(i));
        }
    }
}