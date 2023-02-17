import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        
        for (int i=1; i<=5; i++) {
          double num = sc.nextDouble();
          double sqNum = Math.pow(num, 2);
          sum += sqNum;
        }
        
        int verNum = (int)(sum % 10);
        System.out.println(verNum);
    }
}
