import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int[] numbers = new int[9];
        int index = 0;

        for (int i=0; i<9; i++){
            numbers[i] = sc.nextInt();
            max = Math.max(max, numbers[i]);
            if (max == numbers[i]){
                index = i + 1;
            }
        }
        
        System.out.println(max);
        System.out.println(index);
    }
}