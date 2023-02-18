import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       boolean[] list = new boolean[31];
       int[] submitted = new int[28];
       
       for (int num : submitted) {
           num = sc.nextInt();
           list[num] = true;
       } 
       
       for (int i=1; i<31; i++) {
           if (list[i] == false) {
               System.out.println(i);
           }
       }
    }
}