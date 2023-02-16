import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        String numbers = br.readLine();
        int sum = 0;
        
        for (int i=0; i<N; i++) {
            int number = numbers.charAt(i)-'0';
            sum += number; 
        }
        System.out.println(sum);
    }
}
