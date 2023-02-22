import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cases = Integer.parseInt(br.readLine());
        for (int i=1; i<=cases; i++) {
            StringBuilder sb = new StringBuilder();
            String[] st = br.readLine().split(" ");
            int itr = Integer.parseInt(st[0]);
            String S = st[1];
            
            for(int j=0; j<S.length(); j++){
                char C = S.charAt(j);
                for(int k=0; k<itr; k++){
                    sb.append(C);
                }
            }
            bw.write(sb + "\n");
        }
        bw.flush();
        bw.close();
    }
}
