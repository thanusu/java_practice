 //MATRIC ADD
import java.util.*;
public class MatricAdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int [] [] A =  new int[3][3]; 
        int [] [] B =  new int[3][3]; 
        int [] [] C =  new int[3][3];
         
        
        for(int i = 0; i< 3; i++){
            for (int j = 0; j<3; j++){
                System.out.println("enter the value of "+ i +j);
                 A [i][j] = sc.nextInt() ;
            }
        }
        
        for(int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                System.out.println("enter the value of "+ i +j);
                 B [i][j] = sc.nextInt() ;
            }
        }
        
        for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                
                C[i] [j] = A [i] [j] + B [i] [j];
            }
        }
         
        System.out.print(Arrays.deepToString(C));
    }
}