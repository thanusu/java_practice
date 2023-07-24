//CON CAT OF TWO ARRAYs
import java.util.*;
public class ConCatArrays {
    public static void main(String args[]) {
        
        int [] A = {1,2,3};
        int [] B = {4,5};
        int Len = A.length + B.length;
        int[] C = new int[Len];
        
        for(int i =0; i< A.length; i++){
            C[i] = A[i];
        }
        
        
        int k =0;
        for(int j = A.length; j<C.length ; j++){
          C[j] = B[k];
          k++;
        }
      
      System.out.print(Arrays.toString(C));
    }
}