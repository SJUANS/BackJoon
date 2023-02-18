import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       
       int[] mat1 = new int[N*M];
       int[] mat2 = new int[N*M];
       int[] mat3 = new int[N*M];
        
       for (int i=0; i<mat1.length; i++) {
           mat1[i] = sc.nextInt();
       }
        
       for (int j=0; j<mat2.length; j++) {
           mat2[j] = sc.nextInt();
       }
        
       for (int k=0; k<mat3.length; k++) {
           mat3[k] = mat1[k] + mat2[k];
           if (k == N-1){
               System.out.print(mat3[k] + "\n"); 
           } else {
               System.out.print(mat3[k] + " ");
           }
       }
    }
}