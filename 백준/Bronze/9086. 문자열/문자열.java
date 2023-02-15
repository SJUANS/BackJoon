import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
        
       for (int i=0; i<N; i++){
           String line = sc.next();
           int M = line.length();
           String prefix = String.valueOf(line.charAt(0));
           String postfix = String.valueOf(line.charAt(M-1));
           System.out.println(prefix + postfix);
       }
    }
}