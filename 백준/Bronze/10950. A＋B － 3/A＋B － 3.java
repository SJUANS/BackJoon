import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int N, A, B;
       N = sc.nextInt();
       
       for (int i=1; i<=N; i++) {
           A = sc.nextInt();
           B = sc.nextInt();
           System.out.println(A+B);
       }
    }
}