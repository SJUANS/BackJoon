import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();
        char ascii = scan.charAt(0);
        byte code = (byte)ascii;
        System.out.println(code);
    }
}