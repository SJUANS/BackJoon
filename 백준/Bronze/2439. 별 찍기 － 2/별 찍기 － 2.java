import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int row = Integer.parseInt(br.readLine());
       
       for (int i=1; i<=row; i++) {
           int N = i;
           for (int j=1; j<=row-i; j++) {
               bw.write(" ");
           }
           for (int k=1; k<=N; k++) {
               bw.write("*");
           }
           bw.write("\n");
       }
       bw.flush();
       bw.close(); 
    }
}