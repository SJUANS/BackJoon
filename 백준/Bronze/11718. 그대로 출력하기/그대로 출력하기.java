import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        
        while(true){
            String row = br.readLine();
        if (row == null || row.isEmpty()){
            break;
           }      
           builder.append(row).append("\n");
        }
        br.close();
        System.out.println(builder);
    }
}