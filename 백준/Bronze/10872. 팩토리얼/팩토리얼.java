import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int fac = 1;
        
       if (N == 0) {
          System.out.println(1);
       } else {
               for (int i=1; i<=N; i++) {
               fac = fac * i;
           } System.out.println(fac);
       }  
    }
}