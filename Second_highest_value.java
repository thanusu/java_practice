import java.util.*;
public class Second_highest_value {
    public static void main(String args[]) {
       
       
       Scanner sc = new Scanner(System.in);
       System.out.println("enter values");
       int n = sc.nextInt();
       
       int[] arr = new int[n];
       
       for(int i =  0 ; i< arr.length; i++){
           arr[i] = sc.nextInt();
       }
       
       System.out.println(Arrays.toString(arr));
       
       for(int i = 0; i<=arr.length; i++){
           for(int j = i+1; j<arr.length; j++){
               int temp = 0;
               
               if(arr[i]>arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
          
       }
        System.out.println(Arrays.toString(arr));
       
      System.out.println("2nd value is " + (arr[arr.length-2]));
       }
    }
