import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] ints = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (String num : ints) {
            int intNum = Integer.parseInt(num);
            if (intNum == v) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}

