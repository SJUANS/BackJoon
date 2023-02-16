import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       
       if ((A <= 1000) && (B <= 1000)) {
           int plus = A+B;
           int minus = A-B;
           int multiply = plus * minus;
           
           System.out.println(multiply);
       }
    }
}