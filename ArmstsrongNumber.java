import java.util.*;
class ArmstsrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter a value: ");
        int no = sc.nextInt();
        int arm = 0;
         int n = no;
        while (n > 0){
       
        int rem = n%10;
        arm = arm + (rem*rem*rem);
        n = n/10;
        
    }
    if(arm == no){
        System.out.println("Armstrong");
    }
    else{
        System.out.println("Not Armstrong");
    }
     
}}