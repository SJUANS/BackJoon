import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] nx = br.readLine().split(" "); 
        String[] numbers = br.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);
        
        for (String number : numbers) {
            int numberInt = Integer.parseInt(number);
            if (numberInt < x) {
                bw.write(numberInt + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
